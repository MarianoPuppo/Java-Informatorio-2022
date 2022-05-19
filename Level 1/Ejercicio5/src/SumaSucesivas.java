import java.util.Scanner;

public class SumaSucesivas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int fac = 0;

        for (int b = 1; b <= num2; b++) {
            fac = fac + num1;
        }
        System.out.println(num1 + " " + "x" + " " + num2 + " " + "=" + " " + fac);
    }
}

