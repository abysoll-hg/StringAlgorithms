public class StringAlgorithms {
   public static String printCharacters(String word) {
      String newString = "";
      for (int i = 0; i < word.length(); i++) {
         newString += word.substring(i,i+1) + "\n";
      }
      return newString;
   }
   public static String reverseWord(String word) {
      String newString = "";
      for (int i = word.length(); i > 0; i--) {
         newString += word.substring(i-1,i);
      }
      return newString; 
   }
   public static String capitalizeString(String sentence) {
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
      return newString;
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
   public static char firstUniqueChar(String word) {
      String cut = "";
      for (int i = 1; i < word.length(); i++) {
         cut = word.substring(0,i)+word.substring(i+1);
         if (cut.indexOf(word.charAt(i)) == -1 ) {
            return word.charAt(i);
         }
      }
      return ' ';
   }
   public static void main(String[] Args) {
      System.out.println(printCharacters("hello"));
      System.out.println(reverseWord("hello"));
      System.out.println(capitalizeString("the quick brown fox jumped over the lazy dog"));
      System.out.println(detectPalindrome("racecar"));
      System.out.println(firstUniqueChar("swiss"));
   }
}