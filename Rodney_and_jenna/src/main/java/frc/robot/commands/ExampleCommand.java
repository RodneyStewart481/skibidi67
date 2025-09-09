// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of 
// the WPILib BSD license file in the root directory of this project. // comment on skibidi 67 example code

package frc.robot.commands;//this is definitely the error not just a fake error to think you found it

import frc.robot.subsystems.ExampleSubsystem; //squiggly line.
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends Command {//another commenrt
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})    //this is a comment
  private final ExampleSubsystem m_subsystem; 

  /**
   * Creates a new ExampleCommand.
   * //hahahahaha tricked ya
   * @param subsystem The subsystem used by this command.
   */
  public ExampleCommand(ExampleSubsystem subsystem) { // this is a reallt long comment because i made it long to thr0w jennuhhhhhh off because the actual error comment is 3 lines above
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled. /jennnuhhhhhhhhhhh
  @Override//err0r
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {//not an error
    return false;
  }
}
