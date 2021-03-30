public class Objects {

   public Student {
   
       int age;
       String name;
       
       public Student (String studentName, int studentAge) {
           age = studentAge;
           name = studentName;
       }
       
       public Student () {
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