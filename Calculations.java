import java.util.Scanner;

public class Calculations {

      
      public static void main(String[] args) {
            
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number");
            int num1 = sc.nextInt();
            System.out.print("Enter another number");
            int num2 = sc.nextInt();
            System.out.print("Enter a operator");
            char operator = sc.next().charAt(0);
            sc.close();
            int minus = num1 - num2;

            if (operator == '*') {
                  System.out.println("Value : " + num1 * num2);
            }
            else if (operator == '/') {
                  System.out.println("Value : " + num1 / num2);
            }
            else if (operator == '+') {
                  System.out.println("Value : " + num1 + num2);
            }
            
            else if(operator == '-') {
              System.out.print("value :" + minus);
            } 
            else {
                  System.out.println("Enter valid Operator");
            } 
            
      }
}
