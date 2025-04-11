package lr8.Task2;

import org.apache.poi.hssf.record.chart.DataFormatRecord;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //Создать проект, позволяющий из одного, предварительно созданного
        // программными средствами файла, переписать данные, соответствующие
        // условию - в исходном файле содержится две строки в формате UTF-8 и
        // 5 чисел типа double. В результирующий файл переписать вторую строку
        // и положительные числа.
        try{
            File f1 = new File("/home/ome123/IdeaProjects/programming_24-25/src/lr8/Task2/lr8task2.txt");
            f1.createNewFile();

            String s1 = "1st string";
            String s2 = "2nd string";
            double[] numbers = new double[5];
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = random.nextDouble(-100, 100);
            }


            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            dOut.writeUTF(s1);
            dOut.writeUTF(s2);
            for(double n : numbers){
                dOut.writeDouble(n);
                System.out.println(n);
            }

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
