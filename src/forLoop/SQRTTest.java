package forLoop;

import java.util.Scanner;

public class SQRTTest {
    public static void main(String[] args) {
        System.out.println("Enter the number to find sqrt: ");
        Scanner scanner=new Scanner(System.in);
        float no=scanner.nextFloat();
        float sqrtResult=sqrt(no);
        System.out.println("SQRT of "+no+" is : "+sqrtResult);
    }

    private static float sqrt(float no){
        float sqrtNo = 0;
        if (no>=0){
            float bd,ad;
            for (bd=1; bd * bd<=no; bd++);
            bd--;

            for (ad= (float) 0.001; ad<1.0; ad+=0.001){
                float temp=bd+ad;
                if ((temp*temp)>no){
                    temp= (float) (temp-0.001);
                    sqrtNo=temp;
                    break;
                }
            }
        }
        return sqrtNo;
    }

}
