class TestStatic {
    static int x = 10;
    int y = 20;

    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    static void statDisplay() {
        System.out.println("x in static = " + x);

    }
}

class StaticBlock {
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // TestStatic ts = new TestStatic();
        // ts.display();
        System.out.println(TestStatic.x);
        System.out.println("Main");
        // StaticBlock sb = new StaticBlock();
    }
}
