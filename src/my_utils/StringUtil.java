package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility methods
     */


    /*
    Genti: this method is made to solve the Problem 1: Find duplicate characters from String
     */

    public static String findDuplicateChar(String str){
        String duplicate="";


        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }

            }
            if (count>1 && !duplicate.contains(""+str.charAt(i))){
                duplicate+= str.charAt(i) + " ";
            }
        }
return duplicate.trim();
    }

}
