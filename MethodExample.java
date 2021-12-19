
class Rectangle {
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if (length==breadth) {
            return true;
        }
        return false;
    }
}
/**
 * Circle
 */
class Circle {
    public double radius;
    public int diameter;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return "\n"+"Area = "+ area() +"\n" +"Cirumference = "+ circumference() + "\nDiameter = " + diameter;
    }
}

public class MethodExample {

    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=2;
        // System.out.println("Details  " +c1);
        // double a=c1.area();
        // System.out.printf(" Area =  %6.2f \n",a);
        // System.out.println("Circuference = "+ c1.circumference());

        // Circle1 c2=new Circle1();
        // c2.radius=1;
        // System.out.println("Area C2= "+ c2.area());
        // System.out.println("Circuference  C2= "+ c2.circumference());

        //For Rectangle
        /*
        Rectangle r=new Rectangle();
        r.length=5;
        r.breadth=2;
        System.out.println("Area Rectangle = "+r.area());
        System.out.println("Premiter Rectangle = "+r.perimeter());
        System.out.println(r.isSquare());*/

        






    }

}
