package forLoop;

public class CheckPrimerNumber {
    //check whether the number is prime or not
    public static void main(String[] args) {
        int no=2;
        boolean isPrime = true;

        for (int i=2;i<no;i++){
            if (no % i==0)
                isPrime=false;
        }
        if (isPrime)
            System.out.println("Prime No");
        else
            System.out.println("Not a prime No");
    }
}
