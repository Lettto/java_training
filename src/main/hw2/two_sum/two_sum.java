package two_sum;
import java.util.Scanner;


public class two_sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int[] nums = new int[arr_size];
        for (int i=0; i < arr_size; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] answer = twoSum(nums, target);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i < nums.length; i++){
            for (int j=i+1; j < nums.length; j++){
                if (nums[i]+nums[j] == target){

                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}