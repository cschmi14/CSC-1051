//-------------------------------------------
// Heater.java
// Author: Carter Schmidt
//
//-------------------------------------------

public class Heater {

    private int Temperature;
    private String Status;
    
    // constructor
    Heater () {
        Temperature = 0;
        Status = "On";
    }
    
    
    // fill the method details: return type, parameter if any.
    public void setTemperature(int x){
       Temperature = x;
    }
    
    
    // fill the method details: return type, parameter if any.
    private void update() {
        if (Temperature <= 70)
            Status = "On";
        else if (Temperature > 70)
            Status = "Off";
    }
    
    
    // fill the method details: return type, parameter if any.
    public String getStatus() {
        update();
        return Status;
    }
}