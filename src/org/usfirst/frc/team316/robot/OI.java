package org.usfirst.frc.team316.robot;
import org.usfirst.frc.team316.robot.LunaXBox;

public class OI {
	//Declare new joysticks
	LunaXBox driverStick = new LunaXBox(RobotMap.driverXBoxUSB);
	LunaXBox operatorStick = new LunaXBox(RobotMap.operatorXBoxUSB);
	
	//Declare all of the globals
	static boolean climb;
	double climbSpeed;
	
	//Take all of the joystick inputs and map them to globals
	public void updateGlobals() {
		//If X and Start are pressed, set global to true. Never set back to false
		if (driverStick.getStart() && driverStick.getXButton()) {
			climb = true;
		} 
		
		if (climb == true) {
			climbSpeed = driverStick.getRightStickY(); 
		}else{
			climbSpeed = 0;
		}
		
		
	}
}
