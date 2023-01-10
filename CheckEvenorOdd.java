import java.util.Scanner;

public class CheckEvenorOdd {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int EnterredNum = input.nextInt();
            input.close();
            
            if (EnterredNum % 2 == 0) {
                  System.out.println(EnterredNum + " is Even Number");      
                  
            } else {
                  System.out.println(EnterredNum + " is an Odd number ");
            }
      }
}