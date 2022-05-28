
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainEmpleado {

    public static void main(String[] args){

        Empleado empleado = new Empleado("Jose", "Hernandez", 10, 10, 50);
        Empleado empleado1 = new Empleado("Juan", "Fernandez", 15, 20, 60);
        Empleado empleado2 = new Empleado("Geronimo", "Altos", 20, 3, 70);
        Empleado empleado3 = new Empleado("Joaquin", "Plata", 30, 40, 80);

        Set<Empleado> lista = new HashSet<>();

        lista.add(empleado);
        lista.add(empleado1);
        lista.add(empleado2);
        lista.add(empleado3);

        Map mapEmp = new HashMap();
        lista.forEach(e -> {mapEmp.put(e.dni, e.calcularSueldo());});

        System.out.println(mapEmp);



        //System.out.println(lista);
    }



    }




