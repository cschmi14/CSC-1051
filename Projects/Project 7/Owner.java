public class Owner {

    public static void main(String[] args) {
    
        Dog Haru = new Dog("Haru", "Shiba Inu", "He");
        Haru.setAge(3);
        Haru.printInfo();
        Haru.setAge(4);
        Haru.printInfo();
        Haru.getStatus();
        Haru.play();
        Haru.feed();
        Haru.play();
        
    }

}