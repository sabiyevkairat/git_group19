package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility methods
     */

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
}
