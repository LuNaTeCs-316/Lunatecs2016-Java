package org.usfirst.frc.team316.robot.Subsystems;

import org.usfirst.frc.team316.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
    
	private static final Victor climbMotor = new Victor(RobotMap.climberMotor);
	private static final DoubleSolenoid climbRelease = new DoubleSolenoid(RobotMap.forwardClimberChannel, RobotMap.backwardClimberChannel);
	double climberSpeed;

    public void initDefaultCommand() {
        Climber.initClimber();
    }
    
    public void initClimber() {
    	climbRelease.set(Forward);
    	climbMotor.set(0.0);
    }


}

