package sqrt;
import java.util.Scanner;


public class sqrt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(sqrt(value));
    }
    public static int sqrt(int n){
        int result = 0;
        for (int i = 0; i < n; i++){
            if (i*i <= n){
                result = i;
            } else {
                break;
            }
        }
        return result;
    }
}