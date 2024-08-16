package com.funser.alon.math;

public class Amath {
  
  /**
   * Find the factorial of the number
   * 
   * @param n The number that you want to find it's factorial
   * @return The factorial of the number 
   */
  public static long factorial(long n) {
    long a = 1;
    for (int i = 1; i < n + 1; i++) {
      a *= i;
    }
    return a;
  }
  
}
