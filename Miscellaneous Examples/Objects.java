public class Objects {

   public static void Student {
   
       int age;
       String name;
       
       public static void Student (String studentName, int studentAge) {
           age = studentAge;
           name = studentName;
       }
       
       public static void Student () {
           age = 18;
           name = "Jake";
       }
   }
   public static void main(String[] args) {
   Student John = new Student("John", 20);
   Student Bella = new Student("Bella", 18);
   System.out.println(name);
   }
}