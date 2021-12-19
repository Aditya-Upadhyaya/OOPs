
class Rectangle1{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        if (l<0) {
            length =(~l+1);
        } else {
            length=l;
        }
       
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
    public int perimeter()
    {
        return 2*(length*breadth);
    }

}
public class DataHiding {
    public static void main(String[] args) {
       Rectangle1 r=new Rectangle1();
       r.setLength(-5);
       r.setBreadth(2);
       System.out.println("area = " + r.area());
    }
}
