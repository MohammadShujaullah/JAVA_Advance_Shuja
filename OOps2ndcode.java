
class Student {
    String name;
    int age;
    public void Printinfo(){     //method 
      System.out.println(this.name);
      System.out.println(this.age); 
       
      
    }Student(){  // this is a constructor
        System.out.println("constructor called ");
      }
}


public class OOps2ndcode {
    public static void main (String args []){
    Student s1=new Student ();        //()this the prenthesis,and the function ahead called constructor
    s1.name="aman";
    s1.age=24;
    s1.Printinfo();

    }
}
