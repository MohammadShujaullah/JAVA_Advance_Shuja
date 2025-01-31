class pen {
    String color;
    String types;// ballpoint;gel

    public void write() {
        System.out.println("writting something ");
    }

    public void Printcolor() {
        System.out.println(this.color);
    }
}

public class OOps1stcode {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.types = "gel";
        pen1.write();

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.types = "ballpoint";

        pen1.Printcolor();
        pen2.Printcolor();

    }
}
