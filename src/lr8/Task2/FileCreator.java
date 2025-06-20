package lr8.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class FileCreator {
    public static void main(String[] args) {
        Random random = new Random();
        try{
            File f1 = new File("src/lr8/Task2/lr8task2Input.txt");
            f1.createNewFile();

            String s1 = "1st string\n";
            String s2 = "2nd string\n";
            double[] numbers = new double[5];
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = random.nextDouble(-100, 100);
            }

            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(f1), StandardCharsets.UTF_8));
            out.write(s1);
            out.write(s2);
            for (double num : numbers){
                out.write(String.valueOf(num));
                out.write("\n");
            }
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
