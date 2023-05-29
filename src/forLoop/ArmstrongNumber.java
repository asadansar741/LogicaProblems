package forLoop;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println("is Armstrong:"+ isArmstrongOrNot(153));

        for (int i=100;i<=999;i++){
            int no=i;
            int temp=0;
            while (no>0){
                int reminder=no % 10;
                int cube=reminder*reminder*reminder;
                temp+=cube;
                no/=10;

            }
            if (temp==i)
                System.out.println(i+" is Armstrong");
        }
    }

    private static boolean isArmstrongOrNot(int no){
        int totalOfCube=0;
        int tempNo=no;
        while (no>0){
            int reminder=no % 10;
            int cube=reminder*reminder*reminder;
            totalOfCube+=cube;
            no/=10;

        }
        if (totalOfCube==tempNo)
            return  true;
        return false;
    }
}
