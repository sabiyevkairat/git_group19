package my_utils;

import java.util.ArrayList;
import java.util.Arrays;

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


    /*
    Beyza - created a method to find the duplicate characters and their count in a given string - problem 6
     */
    public static void countDuplicate(String word){

        String duplicate = "";

        for(int i = 0; i < word.length(); i++){
            int count = 0;

            for(int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(count > 1 && !duplicate.contains("" + word.charAt(i))){
                duplicate += word.charAt(i);
                System.out.println(word.charAt(i) + ": " + count);
            }
        }
    }

    /*
    Kai - How to check if a String is a valid shuffle of two String?
    I know this is a wrong solution, just putting it out to practice git
     */

    public static boolean validShuffle(String a, String b, String c){

        String aB = a + b;
        String[] aBTogether = aB.split("");
        ArrayList<String> third = new ArrayList<>(Arrays.asList(c.split("")));

        return (third.containsAll(Arrays.asList(aBTogether)));
    }

}
