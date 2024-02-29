package misc;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GCD {

    public static void main(String[] args) {
        System.out.println(doronGCD(100,12));
        System.out.println(yonatanGCD(100,12));
        System.out.println(auclidicGCD(100,12, 0));
        System.out.println("======================");

        System.out.println(doronGCD(103,104));
        System.out.println(yonatanGCD(103,104));
        System.out.println(auclidicGCD(103,104, 0));
        System.out.println("======================");

        System.out.println(doronGCD(100,10));
        System.out.println(yonatanGCD(100,10));
        System.out.println(auclidicGCD(100,10, 0));
        System.out.println("======================");

        System.out.println(doronGCD(100,50));
        System.out.println(yonatanGCD(100,50));
        System.out.println(auclidicGCD(100,50, 0));
        System.out.println("======================");

        swapNums(12,-2);
    }

    public static void swapNums(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("=========");

        a += b;
        b = a - b;
        a -= b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static int auclidicGCD(int num1, int num2, int counter) {
        counter++;
        if (num2 == 0) {
            System.out.println("Auclidius iterations: " + counter);
            return num1;
        }
        return auclidicGCD(num2, num1 % num2, counter);
    }

    public static int yonatanGCD(int x, int y) {
        int min = min(x,y);
        int max = max(x,y);
        int gcd = 1;

        int counter = 0;
        for (int i = 2; i <= min ; i++) {
            counter++;
            if (min%i==0 && max%i==0){
                gcd = i;
            }
        }

        System.out.println("Yonatan iterations: " + counter);
        return gcd;
    }

    public static int doronGCD(int a, int b) {
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int counter = 0;
        int result = 0;

        for (int i = a; i >= 0; i--) {
            counter++;
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }

        System.out.println("Doron iterations: " + counter);
        return result;
    }
}
