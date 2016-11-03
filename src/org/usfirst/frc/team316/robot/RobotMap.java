package org.usfirst.frc.team316.robot;
/*
 * This maps the constant ports on RoboRIO to names for IO
 * @author316JakeMorris
 */

public class RobotMap {
	//Joystick Ports
	public static final int driverXBoxUSB = 1;
	public static final int operatorXBoxUSB = 2;
	
	//PWM outputs
	public static final int climberMotor = 7;
	public static final int DriveLeftPWM = 0;
	public static final int DriveRightPWM = 1;
	
	
	//Solenoid Outputs
	public static final int pneumaticsControlModule = 0;
	public static final int forwardClimberChannel = 0;
	public static final int backwardClimberChannel = 1;
	
}
