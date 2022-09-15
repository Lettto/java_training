package fibonacci;
import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(fib(value));
    }
    public static int fib(int n){
        if (n < 3){
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
