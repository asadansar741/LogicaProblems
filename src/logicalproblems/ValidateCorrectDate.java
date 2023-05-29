package logicalproblems;

public class ValidateCorrectDate {
    //check whether a date is correct or not
    //EX. assume the date between 1850 to 2050
    public static void main(String[] args) {
        int d=6,m=5,y=1991;
//        int d=31,m=02,y=1991;
        boolean isLeap=false;
        boolean flag=true;

        if (y%100!=0 && y%4==0 || y%400==0){
            isLeap=true;
        }
        if (y<1850 || y>2050 || m<1 || m>12 || d<1 || d>31)
            flag=false;
        else if (m==2){
            if (d==30 || d==31 || d==29 && !isLeap)
                flag=false;
        }
        else if (m==4 || m==6 || m==9 || m==11){
            if (d==31)
                flag=false;
        }

        if (flag)
            System.out.println(d+"/"+m+"/"+y+" is a valid date");
        else
            System.out.println(d+"/"+m+"/"+y+" is not a valid date");
    }
}
