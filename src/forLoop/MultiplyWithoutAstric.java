package forLoop;

public class MultiplyWithoutAstric {
    //Program to multiply of 2 numbers without using *
    public static void main(String[] args) {
        int first=5;
        int second=6;
        int result=0;
        for (int i=1;i<=second;i++){
            result+=first;
        }
        System.out.println("Reslult is : "+result);

    }
}
