package com.funser.alon.test;

import java.util.Scanner;
import com.funser.alon.math.Clock;


public class ClockTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
    
    System.out.println("Enter the 1st time:");
    String time1 = input.nextLine();
    
    
    System.out.println("Enter the 2nd time:");
    String time2 = input.nextLine();
    
    System.out.println("Answer:\n" + Clock.add(time1, time2));
    } catch(Exception e) {
      System.out.println("erong");
    }
  }

}
