package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(25);
        System.out.println("Размер массива: " + size);

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
        }
        System.out.println("Массив: " + Arrays.toString(nums));

        Arrays.sort(nums);
        for(int i = 0; i < nums.length / 2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 -i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println("Массив в порядке убывания: " + Arrays.toString(nums));
    }
}
