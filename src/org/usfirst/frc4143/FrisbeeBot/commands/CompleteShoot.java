// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4143.FrisbeeBot.commands;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4143.FrisbeeBot.Robot;
/**
 *
 */
public class  CompleteShoot extends Command {
    public CompleteShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.shooter.running = true;
        Robot.servoSub.servoSet90();
        Timer.delay(Robot.servoSub.delayServo);
        Robot.servoSub.servoSet0();
        Robot.shooter.startMotor();
        Timer.delay(Robot.shooter.delayMotor);
        Robot.shooter.stopMotor();
        Robot.conveyorSub.conveyorForward();
        Timer.delay(Robot.conveyorSub.delayConveyor);
        Robot.conveyorSub.conveyorOff();
        Robot.shooter.running = false;
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (!Robot.shooter.running) {
            return true;
        } else {
            return false;
        }
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.stopMotor();
        Robot.conveyorSub.conveyorOff();
        Robot.servoSub.servoSet0();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.shooter.stopMotor();
        Robot.conveyorSub.conveyorOff();
        Robot.servoSub.servoSet0();
    }
}
