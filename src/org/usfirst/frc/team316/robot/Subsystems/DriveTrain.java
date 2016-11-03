package org.usfirst.frc.team316.robot.Subsystems;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team316.robot.RobotMap;


/**
 *
 */
public class DriveTrain extends Subsystem {
	
	RobotDrive LunaChassis = new RobotDrive(RobotMap.DriveLeftPWM, RobotMap.DriveRightPWM);
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void initDefaultCommand() {
    	//setDefaultCommand(null);
    }
	
	public void init(){
		System.out.println("Drivertrain Initializing...");
		//LunaChassis.setInverted(kFrontLeft, true);
		System.out.println("Drivetrain Initialized");
	}
	
	
	/**
	 * Drive the chassis. Recommended that you use a deadband method from the LunaXBox or LunaLogitech class
	 * @param moveValue
	 * @param rotateValue
	 */
	public void drive(double moveValue, double rotateValue){
		LunaChassis.drive(moveValue, rotateValue);
	}
	
	
	/**
	 * Implements Arcade Drive with specified joystick values. Recommended to use deadband values. 
	 * @param x
	 * @param y
	 */
	public void arcadeDrive(double x, double y) {
		LunaChassis.arcadeDrive(x, y);
	}
	
	
	
	
	
	
	
	/*public void deadbandJoystick(double moveValue, double rotateValue, double threshold){
		//
		if (Math.abs(moveValue) > threshold){
			moveValue = moveValue;
		}else{
			moveValue = 0;
		}
		
		if (Math.abs(rotateValue) > threshold){
			rotateValue = rotateValue;
		}else{
			rotateValue = 0;
		}
	}*/
}

