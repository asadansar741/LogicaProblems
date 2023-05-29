package logicalproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class SumHighest4digit {
    public static void main(String[] args) {
        int myArr[]={10,20,85,45,21,45,12};
        int sum=0;

        Arrays.sort(myArr);
//        System.out.println(myArr);

        for (int i: myArr){
            System.out.println(i);
        }

        if (myArr.length>=4){
            for (int i=myArr.length-1;i>=3;i--){
                sum+=myArr[i];
                System.out.println("Number is: "+myArr[i]);
            }
        }
        System.out.println("sum is : "+sum);
    }
}
