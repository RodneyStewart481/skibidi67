// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class JennasSuperAwesomeSubsystem extends SubsystemBase {
  /** Creates a new JennasSuperAwesomeCode. */
  
  private TalonFX JennasMotor;
  
  public JennasSuperAwesomeSubsystem() {
       JennasMotor = new TalonFX (0);
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
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
