import java.util.Scanner;

public class Palindrome {
      
      public static void main(String[] args) {
            
      Scanner sc = new Scanner(System.in);
      String newString = sc.nextLine();
      int length = newString.length();
      System.out.println(length);
      
      String reverse = "";
      for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + newString.charAt(i);
      }

      System.out.println("reversed : " + reverse);

      
      if (reverse == newString) {
            System.out.println("yes palindrome");
      } else {
            System.out.println(" no, not palindrom");
      }
      
 }
}
