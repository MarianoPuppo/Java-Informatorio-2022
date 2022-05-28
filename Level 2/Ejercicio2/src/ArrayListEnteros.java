import java.util.ArrayList;
import java.util.List;

public class ArrayListEnteros {


    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList();

        agregarNumeros(enteros);

        System.out.println("Los Elementos de la Lista Antes de Agregar son:");
        for (int i = 0; i < enteros.size(); i++)
            System.out.println(String.valueOf(enteros.get(i)));

        System.out.println("El Tamaño de la Lista es" + " " + enteros.size());
        System.out.println();

        agregarNumeroPrincipio(enteros);
        agregarNumeroFinal(enteros);

        System.out.println("Los Elementos de la Lista Despues de Agregar son:");
        for (int i = 0; i < enteros.size(); i++)
            System.out.println(String.valueOf(enteros.get(i)));

        System.out.println("El Tamaño de la Lista es" + " " + enteros.size());


    }


    public static void agregarNumeros(List<Integer> enteros) {
        enteros.add(12);
        enteros.add(14);
        enteros.add(16);
        enteros.add(17);
        enteros.add(18);

    }

    public static void agregarNumeroPrincipio(List<Integer> enteros) {
        enteros.add(0, 100);
    }

    public static void agregarNumeroFinal(List<Integer> enteros) {
        enteros.add(200);

    }
}


