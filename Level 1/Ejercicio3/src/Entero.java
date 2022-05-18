import java.util.Scanner;

public class Entero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ingr = scan.nextInt();
        int a = 1;
        int a1 = 0;

       for (int b = 1; b <= ingr; b++) {
           for (int c = 1; c <= a; c++) {
               System.out.print(a1+c + " ");
           }

           a++;
           System.out.println();
       }
    }
}
