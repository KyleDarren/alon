package com.funser.alon.string;
import java.util.*;

public class Astring {

/**
 * Turn englsih into a piglatin;
 * 
 * @param string a string contains a word or a sentence
 * @return the piglatin form of the word or sentence that you inputed
 */
  public static String piglatinize(String string) {
    String result = "";
    String str = string.toLowerCase();
    String[] splitStr = str.split(" ");
    for (int i = 0; i < splitStr.length; i++) {
result += splitStr[i].substring(1, splitStr[i].length()) + splitStr[i].charAt(0) + "ay ";
    }
    return result;
  }
  
/**
 * Turn the initial of the word to uppercase.
 * 
 * @param string the word
 * @return the output whereas the initial of the word is in uppercase
 */
  public static String toUpperCaseInitial(String string) {
    return Character.toUpperCase(string.charAt(0)) + string.substring(1, string.length());
  }
  
/**
 * Turn the initial of all the words in the sentence into uppercase
 *
 * @param string the sentence
 * @return the output whereas the initial of all the word in the sentence is in uppercase
 */
  public static String toUpperCaseAllInitials(String string) {
    String result = "";
    String[] splitStr = string.split(" ");
    for (int i = 0; i < splitStr.length; i++) {
      result += Character.toUpperCase(splitStr[i].charAt(0)) + splitStr[i].substring(1, splitStr[i].length()) + " ";
    }
    return result;
  }
  
/**
 * Shuffle all the character in the word
 *
 * @param string the word
 * @return the shuffled letter of the word
 */
public static String shuffle(String string)
{
Random random = new Random();
    char a[] = string.toCharArray();
    for( int i=0 ; i<a.length ; i++ )
    {
        int j = random.nextInt(a.length);
        char temp = a[i]; a[i] = a[j];  a[j] = temp;
    }       
return new String(a);
}

/**
 * Shuufle the letter in each word in a constant word order.
 * 
 * @param string a string contains the word
 * @return the shuffled letter of each word
 */
public static String shuffleEachWords(String string)
{
 String result = "";
 String[] splitStr = string.split(" ");
 for (String x : splitStr) {
   result += shuffle(x) + " ";
 }
 return result;
}

/**
 * Count the letters in the string.
 * 
 * @param string a string that contains words or letters
 * @return the letter together with it's quantity
 */
public static HashMap<String, Integer> countLetter(String str) {
  int MAX_CHAR=356;
  HashMap<String, Integer> obj = new HashMap<String, Integer>();
        int count[] = new int[MAX_CHAR];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                    }
            }
            if (find == 1) {
            
 obj.put(Character.toString(str.charAt(i)), count[str.charAt(i)]);
}
        }
        return obj;
    }
    
public static void main(String[] args) {
  
}

}
