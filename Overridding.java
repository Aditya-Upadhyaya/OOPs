class Super{
     public void display()
     {
        System.out.println("Super Class");
     }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Class");
    }
}
class Car
{
    public void start(){System.out.println("Car is Start"); }
    public void accelerate(){System.out.println("Accelerating car");}
    public void changeGear(){System.out.println("Manual gear is changed");}
}

class LuxaryCar extends Car
{
    public void changeGear(){ System.out.println("Automatic Gear is changed");}
    public void openRoof(){ System.out.println("Roof is Opened ");}
}
public class Overridding {
    public static void main(String[] args) {
        
        Super su=new Sub();
        // Sub s=new Super(); //  Generate errror Can't convert Super to Sub
        su.display();
        
        Car l=new LuxaryCar();
        l.start();
        l.accelerate();
        l.changeGear(); //Super class method is shadowed
        // l.openRoof();   This can't run


    }
}
