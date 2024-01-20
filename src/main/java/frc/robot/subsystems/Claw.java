// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel.MotorType;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Claw extends SubsystemBase {
  static final CANSparkMax leftMotorFront = new CANSparkMax(Constants.ArmConstants.kFrontLeftClawMotorID, MotorType.kBrushed);
  static final CANSparkMax leftMotorBack = new CANSparkMax(Constants.ArmConstants.kBackLeftClawMotorID, MotorType.kBrushed);
  static final CANSparkMax rightMotorFront = new CANSparkMax(Constants.ArmConstants.kFrontRightClawMotorID, MotorType.kBrushed);
  static final CANSparkMax rightMotorBack = new CANSparkMax(Constants.ArmConstants.kBackRightClawMotorID, MotorType.kBrushed);

  /** Creates a new Claw. */
  public Claw() {
    leftMotorFront.setIdleMode(CANSparkBase.IdleMode.kCoast);
    leftMotorBack.setIdleMode(CANSparkBase.IdleMode.kCoast);
    rightMotorFront.setIdleMode(CANSparkBase.IdleMode.kCoast);
    rightMotorBack.setIdleMode(CANSparkBase.IdleMode.kCoast);


  }

  public static void setSpeed(double speed){
    // leftMotor.set(ControlMode.PercentOutput, speed);
    // rightMotor.set(ControlMode.PercentOutput, (-speed * 0.75));
    leftMotorFront.set(speed);
    rightMotorFront.set(-speed);
    leftMotorBack.set(speed);
    rightMotorBack.set(-speed);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
