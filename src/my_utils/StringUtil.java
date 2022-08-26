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

    /*Write a Java program to replace a given character in a String to other provided character, for example,
     if you are asked to replace each blank in a String with %20
     */

    public static String replace20Percent(String str){
        str = str.trim();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                str = str.replace(" ", "%20");
            }
        } return str;
    }

}
