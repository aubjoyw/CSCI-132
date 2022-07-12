package csci132.Lab3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int[] array = {1,2,3,4,5,6,7,8,9,10};
    public static int runs = array.length;

    public static void destroy_array(int[] array){
        Random rand = new Random();
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < runs; i++) {
            int rand_int = rand.nextInt(array.length);
            int[] new_array = new int[array.length - 1];
            for (int x = 0, y = 0; x < array.length; x++) {
                if (x != rand_int) {
                    new_array[y] = array[x];
                    y++;
                }
            }
            array = new_array;
            System.out.println(Arrays.toString(array));
        }
    }


    public static void main(String[] args){
        RandomArray.destroy_array(array);
    }
}
