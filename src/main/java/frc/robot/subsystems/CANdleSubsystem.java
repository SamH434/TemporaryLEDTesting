// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.StrobeAnimation;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CANdleConstants;
import frc.robot.Constants.EnabledSubsystems;

public class CANdleSubsystem extends SubsystemBase {

  private final int LEDOFFSET = 8; // move LED numbers because there are 8 LEDs on the controller
  private CANdle candle;

  public enum AnimationTypes {
    ColorFlow,
    Fire,
    Larson,
    Rainbow,
    RgbFade,
    SingleFade,
    Strobe,
    Twinkle,
    TwinkleOff,
    SetAll
  }

  /** Creates a new CANdleSubsystem. */
  public CANdleSubsystem() {

    // Check if need to initialize arm
    if (!EnabledSubsystems.candle) {
      return;
    }

    System.out.println("Initializing CANdle");

    candle = new CANdle(CANdleConstants.CANdleCANID);

  }

  public void setLEDBlue()
  {
    candle.setLEDs(10,10,200);
    candle.modulateVBatOutput(0.9);
  }

  public void setLEDRed()
  {
    candle.setLEDs(200,10,10);
    candle.modulateVBatOutput(0.9);
  }

  public void setLEDGreen()
  {
    candle.setLEDs(10,200,10);
    candle.modulateVBatOutput(0.9);
  }

  public void blinkGreen()
  {
    candle.animate(new StrobeAnimation(10, 200, 10, 0, 98.0 / 256.0, CANdleConstants.LedCount));
  }

    public void stopBlinking() {
      candle.animate(null);
    }

  public void setLEDOff()
  {
    candle.setLEDs(0,0,0);
    candle.modulateVBatOutput(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}