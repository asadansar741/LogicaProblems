package forLoop;

public class SumOfDigitsUpto1Num {
    //find the sum of digits of a number until the sum is reduced to 1 digit
    //Ex. 538769->38->11->2

    public static void main(String[] args) {
        int num=538769;
        System.out.println("Entered Number is : "+num);
        int sum;

        do {
            sum=0;
            while (num!=0){
                int reminder=num%10;
                sum+=reminder;
                num/=10;
            }
            System.out.println(sum);
            num=sum;
        }while (num/10!=0);
    }
}
