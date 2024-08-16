/*
Dito mo Ilalagay yung mga function na may patungkol sa 
*/
package com.funser.alon.math;

public class Number {
  /**
   * Check if the number is even
   * 
   * @param number number the number you want to check
   * @return return true if the number is even
   */
  public static boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Check if the number is odd
   * 
   * @param number the number you want to check
   * @return Return true if the number is odd
   */
  public static boolean isOdd(int number) {
    if (number % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is composite
   * 
   * @param number the number you want to check
   * @return Return true if the number is composite
   */
  public static boolean isComposite(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    if (count > 2) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is composite
   * 
   * @param number the number you want to check
   * @return Return true if the number is composite
   */
  public static boolean isComposite(double number) {
    return true;
  }
  
/**
   * Check if the number is prime
   * 
   * @param number the number you want to check
   * @return Return true if the number is prime
   */
  public static boolean isPrime(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    if (count > 2) {
      return false;
    } else {
      return true;
    }
  }
  
/**
   * Check if the number is prime
   * 
   * @param number the number you want to check
   * @return Return true if the number is prime
   */
  public static boolean isPrime(double number) {
  return false;
  }
  
/**
   * Check if the number is positive
   * 
   * @param number the number you want to check
   * @return Return true if the number is positive
   */
  public static boolean isPositive(int number) {
    if (number > 0) {
      return true;
    } else {
      return false;
    }
  }

/**
   * Check if the number is positive
   * 
   * @param number the number you want to check
   * @return Return true if the number is positive
   */
  public static boolean isPositive(double number) {
    if (number > 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is negative
   * 
   * @param number the number you want to check
   * @return Return true if the number is negative
   */
  public static boolean isNegative(int number) {
    if (number < 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is negative
   * 
   * @param number the number you want to check
   * @return Return true if the number is negative
   */
  public static boolean isNegative(double number) {
    if (number < 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is natural
   * 
   * @param number the number you want to check
   * @return Return true if the number is natural
   */
  public static boolean isNatural(int number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0 && number > 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is natural
   * 
   * @param number the number you want to check
   * @return Return true if the number is natural
   */
  public static boolean isNatural(double number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0 && number > 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is whole
   * 
   * @param number the number you want to check
   * @return Return true if the number is whole
   */
  public static boolean isWhole(int number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0 && number >= 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is whole
   * 
   * @param number the number you want to check
   * @return Return true if the number is whole
   */
  public static boolean isWhole(double number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0 && number >= 0) {
      return true;
    } else {
      return false;
    }
  }
  
/**
   * Check if the number is decimal
   * 
   * @param number the number you want to check
   * @return Return true if the number is decimal
   */
  public static boolean isDecimal(int number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0) {
    return false;
  } else {
    return true;
  }
  }
  
  /**
   * Check if the number is decimal
   * 
   * @param number the number you want to check
   * @return Return true if the number is decimal
   */
  public static boolean isDecimal(double number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0) {
    return false;
  } else {
    return true;
  }
  }
  
/**
   * Check if the number is non-decimal
   * 
   * @param number the number you want to check
   * @return Return true if the number is non-decimal
   */
  public static boolean isInteger(int number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0) {
    return true;
  } else {
    return false;
  }
  }

/**
   * Check if the number is non-decimal
   * 
   * @param number the number you want to check
   * @return Return true if the number is non-decimal
   */
  public static boolean isInteger(double number) {
    String str = Double.toString((double)number);
String result = str.substring(str.indexOf(".")+1, str.length());
  if (Integer.parseInt(result) == 0) {
    return true;
  } else {
    return false;
  }
  }
  
}
