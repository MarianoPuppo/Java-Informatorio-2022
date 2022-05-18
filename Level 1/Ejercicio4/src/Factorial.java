import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ingr = scan.nextInt();

        int fac = 1;

        for (int b = 2; b <= ingr; b++) {
            fac = b * fac;
        }
        System.out.println(fac);
    }
}

