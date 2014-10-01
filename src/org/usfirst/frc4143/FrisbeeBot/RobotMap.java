// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4143.FrisbeeBot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int xboxControllerPort = 1;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive21;
    public static Servo shooterServo;
    public static DigitalOutput shooterShooterMotors;
    public static DigitalOutput shooterWindowMotor;
    public static Compressor pneumaticsCompressor;
    public static Solenoid pneumaticsSolenoid;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Victor(1, 1);
	LiveWindow.addActuator("DriveTrain", "LeftMotor", (Victor) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Victor(1, 2);
	LiveWindow.addActuator("DriveTrain", "RightMotor", (Victor) driveTrainRightMotor);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
	
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);
        
        shooterServo = new Servo(1, 3);
	LiveWindow.addActuator("Shooter", "Servo", shooterServo);
        
        shooterShooterMotors = new DigitalOutput(1, 1);
	
        
        shooterWindowMotor = new DigitalOutput(1, 2);
	
        
        pneumaticsCompressor = new Compressor(1, 3, 1, 1);
	
        
        pneumaticsSolenoid = new Solenoid(1, 1);
	LiveWindow.addActuator("Pneumatics", "Solenoid", pneumaticsSolenoid);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
