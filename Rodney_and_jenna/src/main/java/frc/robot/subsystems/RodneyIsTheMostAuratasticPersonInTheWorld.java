// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RodneyIsTheMostAuratasticPersonInTheWorld extends SubsystemBase {
  private TalonFX Rodneymotor;
 
  /** Creates a new RodneyIsTheMostAuratasticPersonInTheWorld. */
 
  public RodneyIsTheMostAuratasticPersonInTheWorld() {
    Rodneymotor = new TalonFX(0);
     
  }
 
  public void spinRodneymotor() {
    Rodneymotor.setVoltage(4);
  }

  public void stopRodneymotor() {
    Rodneymotor.setVoltage(0);
  }

  public void moveRodneymotor(double speed) {
    Rodneymotor.setVoltage(speed * 12); 
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
  
