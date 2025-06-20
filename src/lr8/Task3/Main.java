package lr8.Task3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter out = null;

        List<Character> consonants = Arrays.asList(
                'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'
        );

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task3/input.txt"), StandardCharsets.UTF_8));

            out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/lr8/Task3/output.txt"), StandardCharsets.UTF_8));

            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                String[] words = line.split("[\\s,.;:!?()\"—]+");

                StringBuilder filteredWords = new StringBuilder();
                int wordCount = 0;

                for (String word : words) {
                    if (!word.isEmpty() && consonants.contains(word.charAt(0))) {
                        filteredWords.append(word).append(" ");
                        wordCount++;
                    }
                }

                if (wordCount > 0) {
                    out.write("Строка " + lineNumber + " (" + wordCount + " слов): " + filteredWords.toString().trim());
                    out.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлами: " + e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файлов: " + e);
            }
        }
    }
}
