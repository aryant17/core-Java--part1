import java.util.Scanner;

public class SimpleInterest {
      public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            int principle = input.nextInt();
            int time = input.nextInt();
            int rate = input.nextInt();

            input.close();

            int SimpleInterest = (principle * rate * time) / 100;
            System.out.println("Simple interest: " + SimpleInterest);
      }
}
