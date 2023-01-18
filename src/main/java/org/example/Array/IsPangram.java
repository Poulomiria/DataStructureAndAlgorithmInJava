package org.example.Array;

import java.util.Locale;

public class IsPangram {

    public static boolean isPangram(String s)
    {
        int len = 26;
        s = s.toLowerCase();
        boolean[] present = new boolean[26];
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                present[s.charAt(i) - 'a'] = true;
            }
        }
        for(int i = 0; i < len; i++)
        {
            if(!present[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String s =", 099009Abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPangram(s));
    }
}
