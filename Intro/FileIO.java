package Intro;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class FileIO {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\moses.wambui\\Desktop\\Smart\\Java\\Java-Beg-Adv\\Java Concepts\\src\\Readme.MD"; // Replace with your file path

        try {
            // Open the file
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            StringBuilder content = new StringBuilder();
            List<String> wordsList = new ArrayList<>();

            // Read lines from the file and count lines, words, and collect words in a list
            int linesCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                linesCount++;
                content.append(line).append("\n");

                // Split line into words by space and add them to the list
                String[] words = line.split("\\s+");
                wordsList.addAll(Arrays.asList(words));
            }

            bufferedReader.close();

            // Calculate number of words
            int wordsCount = wordsList.size();

            // Count word occurrences
            Map<String, Integer> wordOccurrences = new HashMap<>();
            for (String word : wordsList) {
                wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
            }

            // Find the most occurring words
            int maxOccurrences = Collections.max(wordOccurrences.values());
            List<String> mostCommonWords = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                if (entry.getValue() == maxOccurrences) {
                    mostCommonWords.add(entry.getKey());
                }
            }

            // Display results
            System.out.println("Number of lines in the file: " + linesCount);
            System.out.println("Number of words in the file: " + wordsCount);
            System.out.println("Most occurring word(s) with frequency " + maxOccurrences + ": " + mostCommonWords);

            // Printing content of the file
            System.out.println("\nContent of the file:");
            System.out.println(content.toString());

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
