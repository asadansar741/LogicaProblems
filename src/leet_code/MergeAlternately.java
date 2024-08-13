package leet_code;

public class MergeAlternately {

    //Merge Strings Alternately
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0 ; i< Math.max(word1Length,word2Length); i++){
            if (i<word1Length){
                result.append(word1.charAt(i));
            }
            if (i<word2Length){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}
