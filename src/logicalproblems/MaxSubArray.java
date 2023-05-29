package logicalproblems;

public class MaxSubArray {
    public static void main(String[] args) {

        int [] inputArr = {1,-2,0,3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(inputArr));
    }

    static int maxSubArraySum(int inputArray[])
    {
        int sizeOfArray = inputArray.length;
        int max_val = Integer.MIN_VALUE, max_end = 0;

        for (int i = 0; i < sizeOfArray; i++)
        {
            max_end = max_end + inputArray[i];
            if (max_val < max_end)
                max_val = max_end;
            if (max_end < 0)
                max_end = 0;
        }
        return max_val;
    }
}
