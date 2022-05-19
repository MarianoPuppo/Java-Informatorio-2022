import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int resultado = potencia(num1, num2);

        System.out.println(num1 + " " + "elevado a" + " " +  num2 + " " + "=" + " " + resultado);
    }

    static int potencia(int num1, int num2) {

        int inicio = 1;

        if (num1 > 0 && num2 == 0) {
            return inicio;
        } else if (num1 == 0 && num2 >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= num2; i++) {
                inicio = inicio * num1;
            }
        }
        return inicio;
    }
}
