package misc;

public class Recursions {

    public static int factorial(int number) {
        if (number <= 1)
            return 1;
        return number * factorial(number - 1);
    }

    public static int simpleFactorial(int number) {
        int result = 1;

        for (int multiplier = 2; multiplier <= number; multiplier++) {
            result *= multiplier;
        }

        return result;
    }

    // 0 1 1 2 3 5 8 13 21 34
    // 1 2 3 4 5 6 7  8  9 10
    public static int fibonacci(int idx) {
        if (idx == 1) return 0;
        if (idx == 2) return 1;

        return fibonacci(idx - 1) + fibonacci(idx - 2);
    }

    public static void main(String[] args) {
        //System.out.println(simpleFactorial(8));
        //System.out.println(factorial(8));
        System.out.println(fibonacci(2));
    }
}
