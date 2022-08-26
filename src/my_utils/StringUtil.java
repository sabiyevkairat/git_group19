package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility methods
     */


    /*
    Genti: this method is made to solve the Problem 1: Find duplicate characters from String
     */

    public static String findDuplicateChar(String str) {
        String duplicate = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }

            }
            if (count > 1 && !duplicate.contains("" + str.charAt(i))) {
                duplicate += str.charAt(i) + " ";
            }
        }
        return duplicate.trim();
    }


    /*
    Beyza - created a method to find the duplicate characters and their count in a given string - problem 6
     */
    public static void countDuplicate(String word) {

        String duplicate = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count > 1 && !duplicate.contains("" + word.charAt(i))) {
                duplicate += word.charAt(i);
                System.out.println(word.charAt(i) + ": " + count);
            }
        }
    }


    /*
    Burak - This method will return the highest occurred character in a string.
     */

    static char maxOccurringChar(String str) {
        char ans = str.charAt(0);
        int i, curr_freq = 0, max_freq = 0, n = str.length();
        for (i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curr_freq++;
            } else {
                if (max_freq < curr_freq) {
                    max_freq = curr_freq;
                    ans = str.charAt(i - 1);
                }
                curr_freq = 0;
            }
        }
        if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = str.charAt(i - 1);
        }
        return ans;
    }

    /*
    Kai - How to check if a String is a valid shuffle of two Strings?
    I know this is not the right solution, just putting it out there to practice git
     */

    public static boolean validShuffle(String a, String b, String c) {

        String aB = a + b;
        String[] together = aB.split("");
        ArrayList<String> third = new ArrayList<>(Arrays.asList(c.split("")));

        return (third.containsAll(Arrays.asList(together)));
    }

     /*
    Guzel - Write a program to remove a given character from String
     */


    public static String removeCharacterFromString(String str, char a){
        String result="";

        for (int i=0; i<str.length(); i++){

            if (str.charAt(i)!=a){
                result+=str.charAt(i);
            }
        }

        return result;
    }






}
