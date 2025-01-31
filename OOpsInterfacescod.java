interface Animal {   // this is a  interface class 
    int eye = 2;

    void walk();

}

interface Herbivour {  // this is a  interface class 
    void eat();

}

class Horse implements Animal, Herbivour {
    public void walk() {
        System.out.println("walking on 4 legs ");
    }

    public void eat() {
        System.out.println("eating grass");
    }

}

public class OOpsInterfacescod {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walk();
        
        h1.eat();
    }

}
