class Shape{
    public void area (){
    System.out.println("dispaly area");

    }
}   
class Triangle extends Shape {  
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }

} class Circle extends Shape{
    public void are (int r){
        System.out.println(3.14*r*r);
    }
}

 public class OOpsinheritanceHierarchyType {    // after this type last type is 
    public static void main(String args []){    //hybrid type which mean all three types inheritance 
    Shape s1=new Shape();
    s1.area();

    


    }
}
