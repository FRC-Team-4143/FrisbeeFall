package org.usfirst.frc4143.FrisbeeBot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4143.FrisbeeBot.RobotMap;

public class ConveyorSub extends Subsystem {
    
    Relay conveyor = RobotMap.conveyor;
    DigitalInput limitSwitch = new DigitalInput(1);
    
    public boolean conveyorCorrect = true;

    
    public double delayConveyor = Preferences.getInstance().getDouble("delayConveyor", 1.0);
    
    
    
    
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
    
    public boolean checkSwitch(){
        return limitSwitch.get();
    }
    
    
    
    
    public void initDefaultCommand(){
        
    }
    
}
