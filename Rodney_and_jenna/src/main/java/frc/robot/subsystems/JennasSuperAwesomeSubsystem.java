// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class JennasSuperAwesomeSubsystem extends SubsystemBase {
  /** Creates a new JennasSuperAwesomeCode. */
  
  private TalonFX JennasMotor;
  public String AString = "just a string";
  
  public JennasSuperAwesomeSubsystem() {
    JennasMotor = new TalonFX (0);
    mLauncherState = LauncherState.S_Empty;
  }

  public void spinJennasMotor() {
      JennasMotor.setVoltage(4);
  }

  public void stopJenna() {
      JennasMotor.setVoltage(0);
  }
  public void MoveJenna(double speed) {
      JennasMotor.setVoltage(speed * 12);
  }

  public void spinJennasMotorFaster() {
      JennasMotor.setVoltage(10);
  }

  public enum LauncherState {
    S_Fill, S_Empty, S_Launching
  }
  public static LauncherState mLauncherState;

  public void runLauncherState(){
    switch (mLauncherState){
      case S_Empty:
      spinJennasMotor();
      break;
      case S_Fill:
      stopJenna();
      break;
      case S_Launching:
      spinJennasMotorFaster();
      break;
    }
  }
  
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putString("just a string", AString);
    runLauncherState();
  }
}
