class FinalVariable
{
    final int MAX=10;
    final static int NORMA;
    final int GT;
    static
    {
        NORMA=100;
    }
    FinalVariable()
    {
        GT=1;
    }
    public void display()
    {
        System.out.println("MAX = "+MAX+"\nNORMA = "+NORMA +"\nGT ="+GT);
    }
}

public class FinalExample {

    static final float PI;
    static
    {
        PI=3.14f;
    }
    public static void main(String[] args) {
        FinalVariable fv=new FinalVariable();
        fv.display();
        System.out.println("PI="+PI);
        
    }
}
