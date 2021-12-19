abstract class Super1 {
    public Super1() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Method Super");
    }

    abstract public void meth2();
}

class Sub1 extends Super1 {
    public void meth2() {
        System.out.println("Method2 of Sub");
    }
}
abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}
class Circle3 extends Shape{
    int radius;
    public double perimeter()
    {
        return 2*3.14*radius;
    }
    public double area()
    {
        return (3.14)*radius*radius;
    }
}
class Rectangle3 extends Shape{
    int l,b;
    public double perimeter()
    {
        return 2*(l+b);
    }
    public double area()
    {
        return l*b;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Super1 s=new Sub1();  //we can create the referance of abstract class 
        s.meth1();
        s.meth2();
 
        Circle3 sp=new Circle3();
        Rectangle3 r=new Rectangle3();
        sp.radius=1;
        Shape sh=sp;
        r.l=2;
        r.b=3;
        System.out.println("Area of Circle = " + sh.area());
        System.out.println("Area of Rectangle = " + r.area());

    }
}
