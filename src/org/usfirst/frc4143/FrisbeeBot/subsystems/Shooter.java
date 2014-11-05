// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4143.FrisbeeBot.subsystems;
import org.usfirst.frc4143.FrisbeeBot.RobotMap;
import org.usfirst.frc4143.FrisbeeBot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Servo servo = RobotMap.shooterServo;
    Talon shooterMotor = RobotMap.shooterMotor;
    Relay conveyor = RobotMap.conveyor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public boolean running;
    public boolean conveyorCorrect = true;
    
    public double delayMotor = Preferences.getInstance().getDouble("delayMotor", 1.0);
    public double delayServo = Preferences.getInstance().getDouble("delayServo", 1.0);
    public double delayConveyor = Preferences.getInstance().getDouble("delayConveyor", 1.0);
    
    //servo methods
    public void servoSet90(){
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle1", 90));
    }
    
    public void servoSet0(){
        servo.setAngle(Preferences.getInstance().getInt("ServoAngle2", 0));
    }
///////////////////////////////////////////////////
    
    //talon methods
    public void startMotor(){
        shooterMotor.set(Preferences.getInstance().getInt("MotorSpeed", -1));
    }
    
    public void stopMotor(){
        shooterMotor.set(0);
    }
////////////////////////////////////////////////////
    
    //conveyor methods
    public void conveyorForward(){
        if (conveyorCorrect == true){
        conveyor.set(Relay.Value.kForward);
        } else {
            conveyor.set(Relay.Value.kReverse);
        }
    }
    
    public void conveyorReverse(){
        if (conveyorCorrect == true){
        conveyor.set(Relay.Value.kReverse);
        } else {
            conveyor.set(Relay.Value.kForward);
        }
    }
    
    public void conveyorOff(){
        conveyor.set(Relay.Value.kOff);
    }
    
    public void conveyorSwitch(){
        if (conveyorCorrect == true){
        conveyorCorrect = false;
        } else {
            conveyorCorrect = true;
        }
    }
/////////////////////////////////////////////////////
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
