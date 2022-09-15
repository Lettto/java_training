package last_word;
import java.util.Scanner;

public class last_word {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] splitted = s.split("\\s+");
        int n_words = splitted.length;
        System.out.println(splitted[n_words-1].length());
    }
}