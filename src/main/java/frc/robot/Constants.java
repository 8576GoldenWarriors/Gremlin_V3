// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static final class DriveTrainConstants {
    public static final int leftFrontCANID = 2; //2 anbd 1 are labelled differently on the bot
    public static final int leftBackCANID = 1;
    public static final int rightFrontCANID = 3;
    public static final int rightBackCANID = 4;

    public static final double ksVolts = 0.10; //distance
    public static final double kvVoltSecondsPerMeter = 1; //speed
    public static final double kaVoltSecondsSquaredPerMeter = 0.5; //acceleration?
    public static final double kPDriveVel = 1; //turn

    public static final double kTrackWidthMeters = Units.inchesToMeters(23);
    public static final DifferentialDriveKinematics kDriveKinematics = new DifferentialDriveKinematics(
            kTrackWidthMeters);

 

    // Reasonable baseline values for a RAMSETE follower in units of meters and
    // seconds
    public static final double kRamseteB = 2;
    public static final double kRamseteZeta = 0.7;

    public static final double kGearRatio = 12.6;
    public static final double kWheelRadiusInches = 3;

    public static final double kLinearDistanceConversionFactor = (Units
            .inchesToMeters(1 / (kGearRatio * 2 * Math.PI * Units.inchesToMeters(kWheelRadiusInches)) * 10));

  }
  public static final class ArmConstants{
      public static final int kFrontLeftClawMotorID = 1;
      public static final int kBackLeftClawMotorID = 2;
      public static final int kFrontRightClawMotorID = 3;
      public static final int kBackRightClawMotorID = 4;

      public static final double kArmSpeed = 0.5;
      public static final double kIntakeSpeed = 0.2;
      public static final double kLowShootSpeed = 0.2;
      public static final double kMidShootSpeed = 0.65;
      public static final double kHighShootSpeed = 0.75;
  }
}
