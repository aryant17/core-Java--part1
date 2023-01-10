import java.util.Scanner;

public class Armstrong {
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any three digit num :");
            int num = sc.nextInt();
            int temp = num;
            int r = 0;
            int sum = 0;

            while (temp > 0) {

                  r = temp % 10;
                  sum = sum + (r * r * r);

                  temp = temp / 10;
            }
            
            if(sum == num){
                  System.out.println("Yes Armstrong");
            } else {
                  System.out.println("not a Armstrong number");
      }

      }
}
