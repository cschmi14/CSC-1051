//**********************************************************
// Remote.java     Author: 
//
//**********************************************************



public class Lamp {

    // data declaration
    private boolean isOn = false;
    
    
    // constructor
    Lamp(boolean isOn) {
        this.isOn = isOn;    
    }
    
    
    // method turnOn()
    public void turnOn() {
        isOn = true;
    }
    
    // method turnOff()
    public void turnOff() {
        isOn = false;
    }
    
    // method check()
    public boolean check() {
        return isOn;
    }
    
    
}