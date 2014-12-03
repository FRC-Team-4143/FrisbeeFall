/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4143.FrisbeeBot.subsystems;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4143.FrisbeeBot.RobotMap;

/**
 *
 * @author Anthony
 */
public class ServoSub extends Subsystem{
    
    Servo servo = RobotMap.shooterServo;

    public double delayServo = Preferences.getInstance().getDouble("delayServo", 1.0);
    
    
    
    
    
    public void servoSet90(){
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle1", 90));
    }
    
    public void servoSet0(){
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle2", 0));
    }
    
    public void servoFlip(){
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle1", 90));
        Timer.delay(delayServo);
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle2", 0));
    }
    
    
    public void initDefaultCommand(){
        
    }
}
