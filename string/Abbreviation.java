package com.funser.alon.string;

public class Abbreviation {
  
  public static String abbreviate(String w) {
    String word = w.toLowerCase();
    String n = "";
    
    switch(word) {
      /*
      case "":
        n += "";
        break;
        */
      case "meter":
        n += "m";
        break;
      case "kilometer":
        n += "km";
        break;
      case "decimeter":
        n += "dm";
        break;
      default:
        n += word;
    }
      return n;
  }

  public static void main(String[] args) {
      System.out.println(abbreviate("m"));
  }

}
