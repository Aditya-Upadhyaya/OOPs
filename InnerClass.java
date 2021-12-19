class Outer
{  // class inside class
    int x=10;
    InnerClass i=new InnerClass();
    class InnerClass{
        int y=20;
        void innerDisplay()
        {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }
    void outerDisplay()
    {
       
        i.innerDisplay();
    }

}


//class inside method
class ClassInsideMethod
{
    public void circleDisplay()
    {
        class InnerInMethod{
            void innerMethodDisplay()
            {
                System.out.println("Class Inside Method");
            }
        }
        InnerInMethod im=new InnerInMethod();
        im.innerMethodDisplay();
    }
}

//Anonymus  Class 
abstract class Abs{
      abstract void show();
}
class OuterAnno
{
    void AnooDisplay()
    {
        Abs A=new Abs()
        {
            public void show()
            {
                System.out.println("Inside anno Abtrsct");
            }
        };
        A.show();
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        // Outer.InnerClass oi=new Outer().new InnerClass();
        // oi.innerDisplay();
        o.outerDisplay();

        ClassInsideMethod cim=new ClassInsideMethod();
        cim.circleDisplay();

        // OuterAnno oa=new OuterAnno();
        // oa.AnooDisplay();

    }
}
