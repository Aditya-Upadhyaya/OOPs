// import java.lang.*; 
class CommandLine{

public static void main(String[] args) {
        double sum=0;
        for (int i = 0; i < args.length; i++) {
            double d=Double.parseDouble(args[i]);
            sum=sum+d;
        }
        System.out.println(sum);
    //    System.out.println(args[0]);


    }
}