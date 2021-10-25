package com.example.mipt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCounter
{
    public static int getWordsCount(String phrase)
    {
        String[] words = phrase.split("[ ,.]+");

        return words.length;
    }

    public static int getPuncCount(String phrase)
    {
        Pattern p = Pattern.compile("\\p{Punct}"); //iesko simboliu -!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
        Matcher m = p.matcher(phrase);
        int puncCount = 0;
        while (m.find())
        {
            puncCount++;
        }
        return puncCount;
    }
}
