package org.usfirst.frc.team316.robot.Subsystems;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void init(int LeftPWM, int RightPWM){
		System.out.print("Drivertrain Initializing...");
		RobotDrive LunaChassis = new RobotDrive(LeftPWM, RightPWM);
		LunaChassis.setInverted(kFrontLeft, true);
		System.out.print("Drivetrain Initialized");
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(null);
    }
}

