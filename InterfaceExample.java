/**
 * Test
 */
interface Test {
    void meth1();
    void meth2();
}
class Test2 implements Test{
    public void meth1()
    {
       System.out.println("Method 1 ");
    }
    public void meth2()
    {
        System.out.println("Method 2 ");
    }
    public void meth3()
    {
        System.out.println("Method 3 ");
    }
}

interface Member
{
    void callback();
}
class Customer1 implements Member
{
    String name;
    Customer1(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Ok i will call back, " + name);
    }
}
class Store
{
    Member mem[]=new Member[10];
    int count=0;
    void register(Member m)
    {
        mem[count++]=m;
    }
    void invitesale()
    {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        // Test t =new Test2();
        // Test2 t1=new Test2();
        // t.meth2();
        // t1.meth3();
        Store s=new Store();
        Customer1 c1=new Customer1("jhon");
        Customer1 c2=new Customer1("Mike");
        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}
