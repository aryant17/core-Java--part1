import java.util.Scanner;

public class Fibnacci {
      
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            

            if (num >= 1) {
                  int a = 0;
            int b = 1;
            int c;
            for (int i = 1; i <= num; i++) {
                        c = b + a;
                        System.out.println(c +" ");
                        a = b;
                        b = c;
                        
                  }
            }

      }
}
