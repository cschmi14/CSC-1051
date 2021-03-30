//-------------------------------------------
// User.java
// Author: Carter Schmidt
//
//-------------------------------------------

public class User {

    public static void main (String[] args) {
    
        Heater heat = new Heater();
        
        System.out.println("Temperature set to 50.");
        
        // you code goes here...
        heat.setTemperature(50);
        System.out.println("Heater Status: " + heat.getStatus());
        
        System.out.println("Temperature set to 80.");
        
        // you code goes here...
        heat.setTemperature(80);
        System.out.println("Heater Status: " + heat.getStatus());
        
    }
}