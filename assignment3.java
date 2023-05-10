
import java.util.*;
public class assignment3{

    public static List<Integer> zigzag(List<Integer> nums) {
        Collections.sort(nums); // sort the list in ascending order
        List<Integer> result = new ArrayList<>();
        int left = 0, right = nums.size() - 1;
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                result.add(nums.get(right--)); // take the highest number
            } else {
                result.add(nums.get(left++)); // take the smallest number
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = zigzag(nums);
        System.out.println();
        System.out.println("Zigzag output: " + result);
        System.out.println();
    }
}