package logicalproblems;

public class DifferenceBWTwoDates {
    //find the difference between two dates
    public static void main(String[] args) {
        int d1=6,m1=5,y1=1991;
        int d2=5,m2=1,y2=2021;
        int d=0,m=0,y=0;

        String dat1=d1+"/"+m1+"/"+y1;
        String dat2=d2+"/"+m2+"/"+y2;

        if (d2<d1){
            if (m2==3){
                if (m2%100!=0 && m2%400==0 || m2%4==0)//if leap year
                    m2=m2+29;
                else
                    m2=m2+28;//not a leap year
            }
            else if (m2==5 || m2==7 || m2==10 || m2==12)//if borrowing month having 30 days
                d2=d2+30;
            else
                d2=d2+31;//if borrowing month having 31 days

            m2=m2-1;
        }
        if (m2<m1){
            y2=y2-1;
            m2=m2+12;
        }

        y=y2-y1;
        m=m2-m1;
        d=d2-d1;

        System.out.println("Date1: "+dat1);
        System.out.println("Date2: "+dat2);
        System.out.println("Date difference: "+y+" Year "+m+" Month "+ d+" days");
    }
}
