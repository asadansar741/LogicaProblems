package logicalproblems;

import java.util.ArrayList;
import java.util.List;

public class NonDuplicateElementArray {
    public static void main(String[] args) {
        int arr[]=new int[1];
        arr[0]=0;
//        arr[1]=2;
        System.out.println(subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }
}
