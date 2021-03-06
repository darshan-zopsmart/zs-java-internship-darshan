package com.zs.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Program extracts the words from given string
 */
public class ExtractWords {

    /**
     * @param sentence
     * @return words from the given sentence
     */
    public ArrayList<String> getWordsFromSentence(String sentence) {

        String word = "";
        int index = 0;
        String[] words = new String[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else
                word += sentence.charAt(i);
        }
        words[index++] = word;
        ArrayList<String> wordsList = new ArrayList<>();
        for (String wordIn : words) {
            if (wordIn != null)
                wordsList.add(wordIn);
        }
        return wordsList;
    }

    /**
     * @param args
     */
    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String sentence = scanner.nextLine();
        ExtractWords extractWords = new ExtractWords();
        List<String> words = extractWords.getWordsFromSentence(sentence);
        System.out.println(words);

    }*/
}
