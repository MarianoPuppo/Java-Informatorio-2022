import java.util.Scanner;

public class Mayusculas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();

        int a = palabra.length();

        char[] largo = palabra.toCharArray();

        for (int i = 0; i < a; i++) {
            char b = largo[i];
            if (b >= 'a' && b <= 'z') {
                b = (char) (b - ('a' - 'A'));
                System.out.print((b));
            } else {
                System.out.print(b);
            }
        }
    }
}
