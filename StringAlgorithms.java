public class StringAlgorithms {
   public static void printCharacters(String word) {
      for (int i = 0; i < word.length(); i++) {
         System.out.println(word.substring(i,i+1));
      }
   }
   public static void reverseWord(String word) {
      String newString = "";
      for (int i = word.length(); i > 0; i--) {
         newString += word.substring(i-1,i);
      }
      System.out.println(newString); 
   }
   public static void capitalizeString(String sentence) {
      String newString = "";
      newString += sentence.substring(0,1).toUpperCase();
      for (int i = 1; i < sentence.length(); i++) {
         if (sentence.substring(i-1,i).equals(" ")) {
            newString += sentence.substring(i,i+1).toUpperCase();
         }
         else {
            newString += sentence.substring(i,i+1);
         }
      }
      System.out.println(newString);
   }
   public static boolean detectPalindrome(String word) {
      String newString = "";
      for (int i = word.length(); i > 0; i--) {
         newString += word.substring(i-1,i);
      }
      if (newString.toLowerCase().equals(word)) {
         return true;
      }
      else {
         return false;
      }
   }
   public static void firstUniqueChar(String word) {
      String jI;
      String iI;
      for (int i = 1; i < word.length(); i++) {
         iI = word.substring(i-1,i);
         for (int j = word.length(); j > 0; j--) {
            jI = word.substring(j-1,j);
            if (iI.equals(jI)) {
               word = word.replace(iI,"");
            }
         }
      }
      System.out.println(word.substring(0,1));
   }
   public static void main(String[] Args) {
      printCharacters("hello");
      reverseWord("hello");
      capitalizeString("the quick brown fox jumped over the lazy dog");
      System.out.println(detectPalindrome("racecar"));
      firstUniqueChar("swiss");
   }
}