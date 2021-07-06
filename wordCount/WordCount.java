package wordCount;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> WordsCounter = new HashMap<>();                // дефинираме хеш-мап

        Scanner wordsFile = new Scanner(new File("C:/Users/USER/IdeaProjects/untitled/algorithm/src/wordCount/words.txt"));
                            // файл - думите, които ще търсим в текста

        int counter;

        while (wordsFile.hasNextLine()) {
                            // цикъл за обхождане на файла с думите
            counter = 0;
            String searchedWord = wordsFile.nextLine().toLowerCase();
                            // взима думите от words.txt една по една
            WordsCounter.put(searchedWord, counter);
                            // поставя ги в речника

            Scanner sampleFile = new Scanner(new File("C:/Users/USER/IdeaProjects/untitled/algorithm/src/wordCount/sample.txt"));
                            // файл - текстът, в който ще търсим думите

            while (sampleFile.hasNext()) {
                            // цикъл за обхождане на файла с текста
                String searchedText = sampleFile.next().toLowerCase();
                            // взима думите от sample.txt една по една

                if (searchedText.contains(searchedWord)) {
                            // сравнява думите от текста с думите от речника
                    counter++;
                }
            }
            WordsCounter.put(searchedWord, counter);
                            // записва стойността от counter-a срещу съотв. дума
            sampleFile.close();
        }
        wordsFile.close();

        File resultFile = new File("C:/Users/USER/IdeaProjects/untitled/algorithm/src/wordCount/result.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(resultFile));

        for (Map.Entry<String, Integer> entry : WordsCounter.entrySet()) {
            bf.write(entry.getKey() + " - " + entry.getValue());
                            //entry.getKey - за думата и entry.getValue за броя пъти
            bf.newLine();
        }
        bf.close();

        BufferedReader br = new BufferedReader(new FileReader("C:/Users/USER/IdeaProjects/untitled/algorithm/src/wordCount/result.txt"));
        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}