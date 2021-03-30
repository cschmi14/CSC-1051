import java.util.Scanner;
public class Dog {
    
    Scanner scan = new Scanner(System.in);
    
    final String name;
    final String breed;
    private int age;
    final String gender;
    String status = "hungry";
    
    public Dog(String n, String b, String g) {
    
        name = n;
        breed = b;
        gender = g;
        
    }
    
    public void setAge(int a) {
        
        age = a;
        
    }

    public void printInfo() {
        
        System.out.println("Here is the information for " + name);
        System.out.println(name + " is a " + breed);
        System.out.println(gender + " is " + age + " years old.");
        System.out.println();
    
    }
    
    public void getStatus() {
        
        System.out.println("Status: " + status);
        
    }
    
    public void play() {
    
        if (status.equals("hungry")) {
            System.out.println(name + " is hungry, refuses to play.");
        }
    
        else {
            System.out.println(name + " is full of energy, let's play.");
            status = "hungry";
        }
    
    }

    public void feed() {
    
        System.out.println(name + " has been fed.");
        status = "not hungry";
    
    }

}