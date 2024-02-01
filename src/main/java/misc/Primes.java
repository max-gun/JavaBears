package misc;

import static java.lang.Math.sqrt;

public class Primes {

    public static boolean isPrime(int num) { // O(n)
        if (num % 2 == 0) return false; // O(1)
        for (int i = 3; i < sqrt(num); i+=2) { // O(n)
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void fetchAllPrimes(int num) { // O(n^2)
        if (num >= 2) System.out.println(2); // O(1)
        if (num >= 3) System.out.println(3);// O(1)
        for (int i=5; i <= num; i+=2) { // O(n)
            if (isPrime(i)) // O(n)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int number = 100_000_000;
        fetchAllPrimes(number);
        long after = System.currentTimeMillis();
        System.out.println("Total processing time: " + (after - before));
    }
}
