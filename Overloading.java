public class Overloading {
    float max(float x, float y) {
        return x > y ? x : y;
    }

    float max(int x, int y) {
        return x > y ? x : y;
    }

    double area(double l, double b) {
        return l * b;
    }

    double area(Double r) {
        double a = Math.PI * r * r;
        return a;
    }

    int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }

    boolean validate(String s) {
        return s.matches("[a-zA-Z]*");
    }

    boolean validate(int n)
    {
        return n>3 && n <= 20;
    }

    public static void main(String[] args) {
        Overloading mp = new Overloading();
        System.out.println("Max in Float = " + mp.max(12.5f, 15f));
        System.out.println("Max in Int = " + mp.max(120, 15));
        System.out.println("Area Circle = " + mp.area(5.0));
        System.out.println("Area Rectangle = " + mp.area(5.0, 10.0));
        System.out.println("Reverse = " + mp.reverse(54));
        int A[] = { 3, 56, 7, 8, 9, 10 };
        int C[] = mp.reverse(A);
        for (int i : C) {
            System.out.print(i + "\t");
        }
        System.out.println();
        String str = "Agiyth.";
        System.out.println(mp.validate(str));
        System.out.println(mp.validate(20));

    }
}
