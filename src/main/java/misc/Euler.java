package misc;

public class Euler {


    public static void main(String[] args) {
        long result = firstEulerSolution(1_000_000_000_000L);
        System.out.println(result);
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
