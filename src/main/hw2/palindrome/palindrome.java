package palindrome;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (isPalindrome(s)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean isPalindrome(String x) {
        int first = 0;
        int last = x.length()-1;
        while (first < last){
            if (x.charAt(first) != x.charAt(last)){
                return false;
            }
            first += 1;
            last -= 1;
        }
        return true;
    }
}
