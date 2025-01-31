class Student {
    String name;
    int age;

    public void Printinfo(String name, int age) {

        System.out.println(name + "  " + age);
    }

    public void Printinfo(int age) { // here function overloading is used or compile time polymorphism
        System.out.println(age);
    }

    public void Printinfo(String name) {
        System.out.println(name);// every time diffrent variable or ADDITIONAL variable IS INTRODUCE IN THEW FUNction parenthesis
    }
                                 
}

public class OopspolymorphismCode1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.Printinfo(s1.name, s1.age);
    }
}
