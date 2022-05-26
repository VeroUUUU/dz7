package dz7;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;

public class MasTwenty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input lenght: ");
        int masLenght = in.nextInt();
        int[] array = generateRandomIntArray(masLenght);
        findMax(array);
        findMin(array);
        findAverage(array);
    }


    public static int[] generateRandomIntArray(int n) {
        int[] array = ThreadLocalRandom.current().ints(-20, 20).limit(n).toArray();
        System.out.println("Generated random array: " + Arrays.toString(array));
        return array;
    }

    public static void findMax(int[] array) {
        int maxIndex = 0;
        int max = array[maxIndex];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(String.format("Max element is [%d] with index [%d]", max, maxIndex));
    }

    public static void findMin(int[] array) {
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println(String.format("Min element is [%d] with index [%d]", min, minIndex));
    }

    public static void findAverage(int[] array){
        double average = 0;
        if (array.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        System.out.println("Average number is:"+ average);
    }
}

