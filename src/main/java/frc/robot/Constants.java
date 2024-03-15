// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public class CANdleConstants {

		public static final int CANdleCANID = 60;
		public static final int LedCount = 8+16; // 8 on the controller + 8x32 panel
		public static final int MaxBrightnessAngle = 90;
		public static final int MidBrightnessAngle = 180;
		public static final int ZeroBrightnessAngle = 270;

	}

  public static final class EnabledSubsystems {
		public static final boolean arm = true;
		public static final boolean intake = true;
		public static final boolean shooter = true;
		public static final boolean climber = true;
		public static final boolean candle = false;
		public static final boolean driverCamera =  true;
		public static final boolean noteHuntingCamera = false;
	}

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
