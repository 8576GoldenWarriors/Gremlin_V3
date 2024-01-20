// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Claw;

public class ToggleClaw extends Command {
  Claw claw = new Claw();
  double speed;
  /** Creates a new ToggleClaw. */
  public ToggleClaw(Claw claw, double s) {
    this.claw=claw;
    speed = s;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(claw);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /*if(RobotContainer.joystick.getRawAxis(1)>0.05){
      Claw.toggleClaw(true);
    }
    else{
      Claw.toggleClaw(false);
    }*/

    Claw.setSpeed(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Claw.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
