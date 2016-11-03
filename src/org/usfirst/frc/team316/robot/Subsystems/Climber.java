package org.usfirst.frc.team316.robot.Subsystems;

import org.usfirst.frc.team316.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
    
	//
	
	private static final Victor climbMotor = new Victor(RobotMap.climberMotor);
	private static final DoubleSolenoid climbSolenoid = new DoubleSolenoid(RobotMap.forwardClimberChannel, RobotMap.backwardClimberChannel);
	//Do i need these? Sure, I can use them for returning values.
	double climbSpeed;
	boolean climbRelease;

    public void initDefaultCommand() {
    	this.init();	//Is this useful?
    }
    //Setters
    public void init() {
    	System.out.println("Climber is initializing...");
    	climbRelease = false;
    	climbSpeed = 0.0;
    	System.out.println("Climber Intialized");
    }
    
    //Take in a button and release climber if true
    public void climberRelease(boolean Button) {
    	if (Button == true) {
    		climbRelease = true; //Only set because we can use it for returning values
    		climbSolenoid.set(DoubleSolenoid.Value.kForward);
    	}
    }
    
    
    //Set the motor to the param of controller axis
    public void climberUp(double Axis) {
    	climbSpeed = Axis;
    	climbMotor.set(Axis);
    	
    }
    
    //Getters
    public boolean getclimberStatus() {
    	return climbRelease;
    }
    
    public double getclimberSpeed() {
    	return climbSpeed;
    }
}

