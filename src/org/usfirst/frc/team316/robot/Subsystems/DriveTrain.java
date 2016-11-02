package org.usfirst.frc.team316.robot.Subsystems;

import org.usfirst.frc.team316.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	public void init(int forwardLeft, int forwardRight, int backLeft, int backRight){
		RobotDrive LunaChassis = new Robotdrive(LeftPWM, RightPWM);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

