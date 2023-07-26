package forLoop;

import java.util.*;

public class ReverseStringTuring {

    public static void main(String[] args) {

        String givenArr = "ab-cde-";
        char[] inputArray = givenArr.toCharArray();
        char [] output = new char[inputArray.length];

        int alphabetCount = 0;
        //copy special char
        for (int i=0; i<inputArray.length; i++){
            if (Character.isAlphabetic(inputArray[i])){
                alphabetCount += 1;
            }
            else {
                output[i] = inputArray[i];
            }
        }
        char[] reverseAlphabet = new char[alphabetCount];
        for (int j=0; j<inputArray.length; j++){
            if (Character.isAlphabetic(inputArray[j]))
                reverseAlphabet[--alphabetCount] = inputArray[j];
        }
        int cnt = 0;
        for (int k = 0; k<inputArray.length; k++){
            if (Character.isAlphabetic(inputArray[k]))
                output[k] = reverseAlphabet[cnt++];
        }

        System.out.println("reverse is : "+ Arrays.toString(output));
    }
}
