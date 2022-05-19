import java.util.Scanner;

public class ContarLetra {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el Texto");
        String texto = scan.nextLine();
        System.out.println("Ingrese la Letra a Contar");
        char letra = scan.next().charAt(0);

        int total = 0;
        char caracter;

        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            if (caracter == letra)
                total++;
        }
        System.out.println(total);
    }

}

