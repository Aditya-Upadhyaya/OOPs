class Rect
{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        length=l; 
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int b)
    {
        breadth=b;
    }
    public int area()
    {
        return getLength()*getBreadth();
    }

    //Constructor
    public Rect()
    {
        length=1;
        breadth=1;
    }
    //Parameterized Constructor
    public Rect(int l , int b)
    {
        length=l;
        breadth=b;
    }
    public Rect(int s)
    {
        length=breadth=s;
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Rect r=new Rect();
        Rect r1=new Rect(5, 10);
        Rect r2=new Rect(2);
        System.out.println(r.getLength());
        System.out.println(r1.getLength());
        System.out.println(r2.getLength());
        
    }
}
