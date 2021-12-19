class CircleInherit
{
    protected int radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public CircleInherit()
    {
        radius=0;
    }

}
class Cylinder extends CircleInherit
{
    public int height;
    public double vol()
    {
        return area()*height;
    } 
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public void setRadius(int r)
    {
        radius=r;
    }
}
class Rectangle2
{
    public int length;
    public int breadth;
    int x=10;
    public  Rectangle2()
    {
        length=breadth=1;
    }
    Rectangle2(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void display()
    {
        System.out.println("super");
    }
}
class Cuboid extends Rectangle2
{
    public int height;
    int x=20;
    Cuboid()
    {
        height=1;
    }
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b, int h)
    {
        // super(l,b);
        length=l;
        breadth=b;
        height=h;
    }
    int vol()
    {
        return length*breadth*height;
    }
    void display()   //This method is redefined in subclass
    {
        super.display();
        System.out.println("sub");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder(2,5);
        // System.out.println("Volume = "+ c1.vol());
        // CircleInherit c2=new CircleInherit();
        // System.out.println("Radius = "+ c2.radius);
        c1.setRadius(10);
        System.out.println("Radius = "+ c1.radius);   //It was the radius of Cylinder //Radius of Circle was not changed 
        
        
        
        Cuboid cu=new Cuboid(2,5,3);
        cu.display();
        System.out.println();

        


    }
}
