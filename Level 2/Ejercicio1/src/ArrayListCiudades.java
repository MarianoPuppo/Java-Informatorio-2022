import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCiudades {

    public static void main(String[] args) {
        List<String> ciudadesFavoritas = new ArrayList();

        agregarProvincias(ciudadesFavoritas);



        for (int i = 0; i < ciudadesFavoritas.size(); i++)
            System.out.println(String.format("#%s - %s", i+1, ciudadesFavoritas.get(i)));

    }




    public static void agregarProvincias(List<String> ciudadesFavoritas) {
        ciudadesFavoritas.add("Mendoza");
        ciudadesFavoritas.add("Salta");
        ciudadesFavoritas.add("Tucuman");
        ciudadesFavoritas.add("Cordoba");
        ciudadesFavoritas.add("Bariloche");

    }
}
