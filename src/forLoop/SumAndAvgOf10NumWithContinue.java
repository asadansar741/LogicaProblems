package forLoop;

import java.util.Scanner;

public class SumAndAvgOf10NumWithContinue {
    //Find the sum and avg of 10  positive numbers

    public static void main(String[] args) {
        int i=1;
        int sum=0;
        float avg=0;
        Scanner scanner=new Scanner(System.in);
        while (i<=10){
            System.out.println("Enter the Number");
            float no=scanner.nextFloat();
            if (no<0){
                System.out.println("Enter a positive number");
                continue;
            }
            i++;
            sum+=no;
            avg=sum/10;
        }
        System.out.println("Sum is : "+sum +" and avg is : "+avg);
    }
}
