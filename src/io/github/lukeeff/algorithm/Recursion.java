package io.github.lukeeff.algorithm;

/**
 * Small class practicing method recursion.
 *
 * @author lukeeff
 * @since 1.0
 */
public class Recursion {

    /**
     * Reverses a string using method recursion.
     *
     * @param s the string to be reversed.
     * @return the reversed string.
     */
    public static String reverse(String s) {
        return (s.length() < 1) ? s : reverse(s.substring(1)).concat(s.substring(0,1));
    }

    /*
     * horrible algorithm. Great for draining battery :]
     */
    public static int fib(int num) {
        return (num <= 1) ? num : fib(num - 1) + (fib(num - 2));
    }


}
