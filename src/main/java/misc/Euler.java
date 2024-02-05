package misc;

import java.util.stream.IntStream;

public class Euler {


    public static void main(String[] args) {
        //long result = firstEulerSolution(1_000_000_000_000L);
        //System.out.println(result);

        int[] arr = {1,8,3,4,2,10,9,7,6};
        findMissingNumber(arr);
    }

    public static void findTwoMissingNumbers(int[] numbers) {

    }

    private static void findMissingNumber(int[] numbers) {
        int inputSum = 0;
        int naturalSum = numbers.length + 1;

        for (int i = 0; i < numbers.length; i++) {
            inputSum += numbers[i];
            naturalSum += (i+1);
        }

        System.out.println(naturalSum - inputSum);
    }

    private static long firstEulerSolution(long num) {
        long sum = 0;

        for (int i = 3; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        return sum;
    }

}
