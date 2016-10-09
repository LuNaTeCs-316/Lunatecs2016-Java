package org.usfirst.frc.team316.robot;

import edu.wpi.first.wpilibj.Joystick;

public class LunaLogitech extends Joystick {

	
	public LunaLogitech(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	public LunaLogitech(int port, int numAxisTypes, int numButtonTypes) {
		super(port, numAxisTypes, numButtonTypes);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Make getting Logitech joystick values easier and for practice
	 * @author JakeMorris
	 */
	
	public boolean getButton(int Button) {
		return this.getRawButton(Button);
	}

	public double getAxisX() {
		return this.getRawAxis(0);
	}
	
	public double getAxisY() {
		return this.getRawAxis(1);
	}
	
	public double getAxisZ() {
		return this.getRawAxis(2);
	}
}

