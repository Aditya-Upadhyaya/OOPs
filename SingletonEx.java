// import java.util.*;
import java.lang.String;
class Student1 {
    private String roll;
    // private static int count = 1;

    // private String generateRoll() {
    //     Date d = new Date();
    //     String r = "DS-" + (d.getYear() + 1900) + "-" + count;
    //     // String r="1";
    //     count++;

    //     return r;
    // }

    // public Student1() {
    //     roll = generateRoll();
    // }

    void display() {
        System.out.println("Roll = " + roll);
    }
}

public class SingletonEx {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Student1 s1 = new Student1();
            s1.display();
        }

    }
}
