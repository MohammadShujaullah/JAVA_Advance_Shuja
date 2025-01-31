class Student {
    String name;
    int age;
    public void Printinfo(){                           //}// blue print 
        System.out.println(this .name);
        System.out.println(this.age);
    }
    Student (String name,int age){
      this.name=name;
      this.age=age;
    }
}

public class OOpsParametriseConstructor {
    public static void main (String args[]){
      Student s1=new Student ("aman",24);
       
     s1.Printinfo();

    }
}
