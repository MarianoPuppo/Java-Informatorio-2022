import java.util.Scanner;

public class ImpresionMensaje {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su Nombre y Apellido");
        String nyp = scan.nextLine();
        System.out.println("Ingrese su Edad");
        String edad = scan.nextLine();
        System.out.println("Ingrese su Dirección");
        String dire = scan.nextLine();
        System.out.println("Ingrese su Ciudad");
        String ciudad = scan.nextLine();

        System.out.printf("%s, %s, %s, %s%n", ciudad, dire, edad, nyp);
    }

}
