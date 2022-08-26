package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility methods
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
