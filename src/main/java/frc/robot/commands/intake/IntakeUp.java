/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeUp extends CommandBase {
  /**
   * Creates a new IntakeDown.
   */
  Intake intake;
  public IntakeUp(Intake i) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(i);
    intake = i;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.in(0.0);
    intake.move(-0.8);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.move(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return intake.getLimitSwitch();
  }
}
