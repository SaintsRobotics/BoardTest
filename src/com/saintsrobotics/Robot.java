package com.saintsrobotics;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends SampleRobot {
	
    SpeedController[] motors = new SpeedController[] {
    		new Talon(0),
    		new Talon(1),
    		new Talon(2),
    		new Talon(3),
    		new Talon(4),
    		new Talon(5),
    		new Talon(6),
    		new Talon(7)
    };

    public Robot() {
        OI.init();
    }
    
    public void robotInit() {
    	
    }
    
    public void autonomous() {
    	
    }

    public void operatorControl() {
    	double drive = OI.getAxis(OI.Axis.LY);
    	double turn = OI.getAxis(OI.Axis.RX);
    	
    	motors[0].set(drive-turn);
    	motors[1].set(drive+turn);
    }
}
