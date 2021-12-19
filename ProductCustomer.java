class Product {
    private String itemno;
    private String name;
    private double price;
    private int quantity;

    public Product(String i, String n) {
        itemno = i;
        this.name = n;
    }
    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void setQuantity(int q)
    {
        quantity=q;
    }
    public String toString()
    {
          return "item no = "+itemno +"\n Name ="+this.name+"\n price = "+price+ "\n Quantity = "+quantity;
    }
    
}
class Customer
{
    private String custid;
    private String name;
    private String address;
    private String number;
    public String toString()
    {
          return "Customer id = "+custid +"\n Name ="+this.name+"\n Address = "+address+ "\n Contact Number = "+number;
    }
    public Customer(String c, String n,String a,String s)
    {
        custid=c;
        name=n;
        address=a;
        number=s;
    }
}

public class ProductCustomer {
    public static void main(String[] args) {
        Product p1=new Product("A102", "Maggi");
        p1.setPrice(100);
        p1.setQuantity(5);
        System.out.println("Product : \n"+p1);
        Customer c1=new Customer("A-5-102144656", "Jhon", "23, Street No. 5, Brelin", "+112457723");
        System.out.println("Cutomer : \n"+c1);
    }
}
