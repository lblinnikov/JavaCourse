package org.Collections.Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpinWords {

    public static String spinWords(String sentence) {
        String separator = " ";
        String word = "";
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(separator)));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordList.size(); i++) {
                word = wordList.get(i);
                if (word.length() >= 5) {
                    word = new StringBuilder(word).reverse().toString();
                    //wordList.set(i, word);
                }
            sb.append(word);
            sb.append(separator);
        }
        sentence = sb.toString().trim();
        System.out.println(sentence);
        return sentence;
    }

    public static void main(String... arg) {

        spinWords("Testing this long unmodified string");

    }

}
