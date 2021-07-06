package wordCount;

import java.util.*;
import java.io.*;

public class WordCountExample {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();

        Scanner wordsFile = new Scanner(new File("words.txt"));

        while (wordsFile.hasNextLine()) {
            words.add(wordsFile.nextLine().toLowerCase());
        }
        wordsFile.close();

        int[] wordsCount = new int[words.size()];

        Scanner sampleFile = new Scanner(new File("sample.txt"));

        while (sampleFile.hasNext()) {
            String sampleWord = sampleFile.next().toLowerCase();
            for (String word : words) {
                if (sampleWord.contains(word)) {
                    wordsCount[words.indexOf(word)]++;
                }
            }
        }
        sampleFile.close();

        PrintStream resultFile = new PrintStream("result.txt");
        for (String word : words) {
            resultFile.format("%s - %s%n", word, wordsCount[words.indexOf(word)]);
        }
        resultFile.close();
    }
}
