abstract class Animals {
    abstract void walk();
   void breath(){
    System.out.println("these animal breath air ");

   }  Animals(){
    System.out.println("you are about to creat an animal ");
   }
    public void eat() {
        System.out.println("eating grass ");

    }
}

class Horse
extends Animals{
    Horse(){
        System.out.println("you have creat a horse ");
    }
    void walk() {
        System.out.println("walk with 4 leg ");

    }
}

class Chicken
extends Animals{
   Chicken(){
    System.out.println("you have creates a chicken ");
   }
    void walk() {




        System.out.println("walk with 2leg ");

    }
}

public class OOpsAbstractionCode1 {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();

        horse1.eat();

    }
}