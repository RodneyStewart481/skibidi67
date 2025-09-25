// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.RodneyIsTheMostAuratasticPersonInTheWorld;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import com.ctre.phoenix6.hardware.TalonFX;
// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class InstantCommands1 extends InstantCommand {


  private RodneyIsTheMostAuratasticPersonInTheWorld Rodneysubsystem;

  public InstantCommands1(RodneyIsTheMostAuratasticPersonInTheWorld m_Tempsub) {
  
    // Use addRequirements() here to declare subsystem dependencies.
    Rodneysubsystem = m_Tempsub;
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Rodneysubsystem.stopRodneymotor();
  }
}
