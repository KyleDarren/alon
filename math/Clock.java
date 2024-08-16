package com.funser.alon.math;

public class Clock {
  
  /**
   * Add two inputed times with the format off "hour : minute"
   * Example:
   * <pre>
   * Clock.add("4:30", "6:45");
   * </pre>
   * Output: "11:15"
   * 
   * @param a the first inputed time 
   * @param b the second inputed time
   * @return the sum of the inputed times in a string format
   */
  public static String add(String a, String b) {
    String[] hourA = a.split(":");
    String[] hourB = b.split(":");
    int minute = Integer.parseInt(hourA[1]) + Integer.parseInt(hourB[1]);
    int hour = Integer.parseInt(hourA[0]) + Integer.parseInt(hourB[0]);
    String minuteStr = "";
    
    if (minute >= 60) {
      hour += minute / 60;
      minute %= 60;
    }
    
    if (minute < 10) {
      minuteStr += "0" + Integer.toString(minute);
    } else {
      minuteStr += Integer.toString(minute);
    }
    
    return Integer.toString(hour) + ":" + minuteStr;
  }

}
