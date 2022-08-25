package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility methods
     */

    // reverse a string
    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // palindrome method - checks if the String is read the same forward and backwards
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    /*
    Fix Format
    create a method will accept a String and return a String in
    proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase
     */
    public static String fixFormat(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /*
    Camel Case
    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
    Exception: First word starts with lowercase
     */
    public static String camelCase(String str) {

        String[] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for (int i = 1; i < allWords.length; i++) {
            camelCase += fixFormat(allWords[i]);
        }

        return camelCase;
    }

    /*
        Frequency of a specific character in a String
        Given a String and a char, determine how many times the given char is found in the String
     */
    public static int frequencyOfChar(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    /*
    Duplicate characters
    Given a String, find and return the duplicate characters. A character is duplicate if it appears more than once in the String.
     */

    public static String getDuplicateCharacters(String str) {

        String duplicate = "";
        for (int i = 0; i < str.length(); i++) {

            if (duplicate.contains("" + str.charAt(i))) {
                continue;
            }

            int frequency = frequencyOfChar(str, str.charAt(i));

            if (frequency > 1) {
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }

    public static String getUniqueCharacters(String str) {

        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            int frequency = frequencyOfChar(str, str.charAt(i));

            if (frequency == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;
    }

}
