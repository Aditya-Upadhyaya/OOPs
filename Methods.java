// import java.lang.reflect.Method;

public class Methods {

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    void change(int B[], int index, int value) {
        B[index] = value;
    }

    void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int gcd(int a, int b)
    {
        while (a!=b) {
            if (a>b) {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
    int max(int A[])
    {
        int max1=A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i]>max1) {
                max1=A[i];
            }
        }
        return max1;
    }
    
    public static void main(String[] args) {
        // int a = 15, b = 28;
        // System.out.println("Max = " + max(a, b));
        Methods mp = new Methods(); // call by making object
        // System.out.println("Min = " +mp.min(a, b));
        int B[] = { 4, 5, 7, 8, 10 };
        mp.change(B, 1, 12);
        // for (int i : B) {
            // System.out.print(i + "\t");
        // }
        int n = 11;
        mp.factor(n);
        System.out.println(mp.isPrime(n));
        System.out.println("gcd = " + mp.gcd(25, 5));
        int A[]={2,42,5,6,10};
        System.out.println("max = " + mp.max(A));

    }
}
