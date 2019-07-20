package ca.jrvs.challenge;

/**
 * Find if a Number is even or Odd
 * Solution 1: Using Modulo Operator
 * <p>
 * Solution 2: Using BitWise Operator
 * For 9:
 * <p>
 * 9 ->        1 0 0 1
 * 1 ->     &  0 0 0 1
 * -------------------
 * result->    0 0 0 1
 * <p>
 * So 9 AND 1 gives us 1, as the right most bit of every odd number is 1.
 * <p>
 * For 14:
 * <p>
 * 14 ->      1 1 1 0
 * 1  ->   &  0 0 0 1
 * ------------------
 * result->   0 0 0 0
 * <p>
 * So 14 AND 1 gives us 0, as the right most bit of every even number is 0.
 */
public class EvenOrOdd {

    public static void evenOrOdd(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " Even");
        } else {
            System.out.println(a + " Odd");
        }
    }

    public static void evenOrOddBit(int a) {
        if ((a & 1) == 0) {
            System.out.println(a + " Even");
        } else {
            System.out.println(a + " Odd");
        }
    }
}