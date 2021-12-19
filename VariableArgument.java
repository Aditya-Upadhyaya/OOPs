public class VariableArgument {
    void show(int... x) {
        for (int i : x) {
            System.out.println(i);
        }
    }

    void show(byte b) {
        System.out.println("Byte = " + b);
    }

    int max(int... x) {
        if (x.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int max = x[0];
            for (int i = 0; i < x.length; i++) {
                if (x[i] > max) {
                    max = x[i];
                }
            }
            return max;
        }
    }
    int sum(int ...x)
    {
        int sum=0;
        if (x.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            for (int i = 0; i < x.length; i++)
                sum=sum+x[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        VariableArgument va = new VariableArgument();
        // va.show(new int[]{10,20,45,245});
        // va.show(15);
        // va.show(10);
        System.out.println(va.max());
        System.out.println(va.sum());
        System.out.println(va.sum(8,15,20,45,10));
    }
}
