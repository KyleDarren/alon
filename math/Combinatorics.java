package com.funser.alon.math;
import com.funser.alon.math.Amath;

public class Combinatorics {
  /**
   * Determine the number of possible arrangements in the set.
   * 
   * @param n total items in the set
   * @param r items taken for the permutation
   * @return the number of possible arrangement
   */
  public static long permutation(long n, long r) {
    long a = 1;
    for (long i = (n - r) + 1; i < n + 1; i++) {
      a *= i;
    }
    return a;
  }
  
  /**
   * Determine the number of possible combination in the set.
   * 
   * @param n total items in the set
   * @param r items taken for the combination
   * @return the number of possible combination
   */
  public static long combination(long n, long r) {
    long a = 1;
    for (long i = (n - r) + 1; i < n + 1; i++) {
      a *= i;
    }
    return a / Amath.factorial(r);
  }

}
