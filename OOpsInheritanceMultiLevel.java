class Shape{
    public void area (){
    System.out.println("dispaly area");

    }
}   
class Triangle extends Shape {
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
} 

class Equilateraltriangle extends Tringle {
    public void area(int l,int h){
        System.out.println( 1/2*h*l);
    }
}
public class OOpsInheritanceMultiLevel {
    public static void main (String args []){

    }
}
