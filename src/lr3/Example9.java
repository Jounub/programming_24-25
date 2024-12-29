package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] nums = new int[size];
        Random random = new Random();

        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
        }

        System.out.println("Массив: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));

        int a = 0;
        boolean keepPrint = true;
        do{
            System.out.println("Минимальный элемент массива с индексом [" +a+ "], со значением = " + nums[a]);
            a++;
            if(nums[a] != nums[a-1]){
                keepPrint = false;
            }
        } while (keepPrint);
    }
}
