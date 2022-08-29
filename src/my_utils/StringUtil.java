package my_utils;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {
    /*
        This class will be used to create String utility methods
     */

    static String removeDuplicate(char str[], int n) {

        int index = 0;


        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));

    }
    // class is updated
    //class is updated



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
    public static void main(String[] args) {

        System.out.println("Please type your word.System will check is it a Palindrome or not");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverse =(""); // reverse my string read it back from last index to first,backwards

        for(int i = word.length() -1; i >= 0; i--){ // i is just a number. but using length -1 allow me to find the

            reverse += word.charAt(i);

        }
        System.out.println(reverse);
        if (word.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
        System.out.println(word.equals(reverse) ?"Palindrome" : "It is not Palindrome");

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


    // Deniz - Check if two strings are anagram of each other. Can include digits but ignore spaces, punctuation, and capitalization.
    
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            if(Character.isDigit(x) || Character.isLowerCase(x))
                s1 += "" + x;
        }
        for (int i = 0; i < str2.length(); i++) {
            char x = str2.charAt(i);
            if(Character.isDigit(x) || Character.isLowerCase(x))
                s2 += "" + x;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            return true;
        return false;
    }



}




