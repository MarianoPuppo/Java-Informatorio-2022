import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    public static void main(String[] arg) {
        ArrayList<String> estudiantes = new ArrayList();
        estudiantes.add("Pedro");
        estudiantes.add("Juan");
        estudiantes.add("Jose");
        estudiantes.add("Manuel");
        estudiantes.add("Erika");
        estudiantes.add("Joaquin");
        estudiantes.add("Marcos");
        estudiantes.add("Eustaquio");
        estudiantes.add("Estanislao");
        estudiantes.add("Nara");
        estudiantes.add("Wanda");
        estudiantes.add("Sana");


        System.out.println("La Lista Completa: " + estudiantes);

        List<String> primerLista = estudiantes.subList(0, 4);
        List<String> segundaLista = estudiantes.subList(4, 8);
        List<String> terceraLista = estudiantes.subList(8, 12);

        System.out.println("Primer Lista:" + primerLista);
        System.out.println("Segunda Lista:" + segundaLista);
        System.out.println("Tercera Lista:" + terceraLista);

}

}
