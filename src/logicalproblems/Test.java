package logicalproblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
//    public static void main(String[] args) {
//        System.out.println(10+20+"Hiiiii");//30Hiiiii
//        System.out.println("Hiiiii"+10+20);//Hiiiii1020
//        System.out.println(10*20+"Hiiiii");//200Hiiiii
//        System.out.println("Hiiiii"+10*20);//Hiiiii200
//    }

    public static void main(String[] args) {
        int String = 10;
        System.out.println(String);

        String date = "20/05/2022";
        //split date based on "/" and correct the parsing into LocalDate obj
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate =  LocalDate.parse(date, format);
        System.out.println(localDate);
    }
}
