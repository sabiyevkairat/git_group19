package my_utils;

import java.util.Arrays;

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
}




