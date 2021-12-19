class Circle1 {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class ClassCircle {

    public static void main(String[] args) {
        Circle1 c1=new Circle1();
        c1.radius=2;
        System.out.println("Area = "+ c1.area());
        System.out.println("Circuference = "+ c1.circumference());

        Circle1 c2=new Circle1();
        c2.radius=1;
        System.out.println("Area C2= "+ c2.area());
        System.out.println("Circuference  C2= "+ c2.circumference());

    }

}
