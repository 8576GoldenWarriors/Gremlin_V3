// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class MoveArmUp extends Command {
  /** Creates a new MoveArm. */
  Arm arm;
  double arm_speed;
  public MoveArmUp(Arm arm, double speed) {
    this.arm = arm;
    arm_speed = speed;
    addRequirements(arm);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // armSpeed = 0.2; //RobotContainer.joystick.getRawAxis(1)*0.1;
    Arm.setSpeed(arm_speed);
    
  //  if (Robot.potentiometer1.get()){
  //     Arm.setSpeed(0);
  //     end(true);
  //  }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Arm.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
