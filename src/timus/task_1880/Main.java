package timus.task_1880;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader=
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        int size1 = Integer.parseInt(bufferedReader.readLine());
        String[] string1 = bufferedReader.readLine().split(" ");
        int size2 = Integer.parseInt(bufferedReader.readLine());
        String[] string2 = bufferedReader.readLine().split(" ");
        int size3 = Integer.parseInt(bufferedReader.readLine());
        String[] string3 = bufferedReader.readLine().split(" ");

        int allSize = size1 + size2 + size3;
        String[] strings = new String[allSize];

        for(int i = 0, x = 0, y = 0; i < allSize; i++){
            if(i < size1){
                strings[i] = string1[i];
                continue;
            }
            if (i < size2 + size1) {
                strings[i] = string2[x];
                x++;
                continue;
            }
            strings[i] = string3[y];
            y++;
        }
        Arrays.sort(strings);

        int count = 0;
        for (int i = 1; i < strings.length - 1; i++){
            if(strings[i - 1].equals(strings[i]) && strings[i].equals(strings[i + 1])){
                count++;
            }
        }
        System.out.println(count);
    }
}
