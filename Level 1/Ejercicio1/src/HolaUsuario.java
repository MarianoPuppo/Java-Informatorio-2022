import javax.swing.*;
import java.util.Scanner;

public class HolaUsuario {
    public static void main(String[] args) {
        System.out.println("----Ingrese su Nombre----");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        System.out.println(String.format("HOLA  %s!!!", nombre));
    }
}
