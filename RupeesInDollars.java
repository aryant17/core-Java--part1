import java.util.Scanner;

public class RupeesInDollars {
      
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter in Rupees :");
            
            int rupees = sc.nextInt();
            sc.close();

            int dollar = rupees * 82;

            System.out.println("Conversion into dollars :" + dollar);
      }
}
