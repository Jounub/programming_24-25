package timus.task_1001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1001/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            List<Long> numbers = new ArrayList<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.trim().split("\\s+");
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        numbers.add(Long.parseLong(token));
                    }
                }
            }

            for (int i = numbers.size() - 1; i >= 0; i--) {
                long num = numbers.get(i);
                double sqrt = Math.sqrt(num);

                System.out.printf("%.4f%n", sqrt);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
