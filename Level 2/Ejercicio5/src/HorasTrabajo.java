import java.util.ArrayList;


public class HorasTrabajo {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList();
        ArrayList<Integer> valorPorHora = new ArrayList();
        ArrayList<Integer> listaFinal = new ArrayList();


        agregarHoras(horasTrabajadas);
        agregarValorHora(valorPorHora);

        System.out.println(horasTrabajadas);
        System.out.println(valorPorHora);

        //ArrayList<Integer> totalFinal = (ArrayList<Integer>) Stream.concat(horasTrabajadas.stream(), valorPorHora.stream()).collect(Collectors.toList());
        for (int i = 0; i < valorPorHora.size(); i++) {

            listaFinal.add(horasTrabajadas.get(i) * valorPorHora.get(i));

        }

        int total = 0;
        for (int i = 0; i < listaFinal.size(); i++) {

            int num = listaFinal.get(i);
            total = total + num;


        }
        System.out.println();
        System.out.println(listaFinal);
        System.out.println("Total Final: $" + total);
        //System.out.println("Las horas trabajadas son:" + " " + totalHorasPorSemana);
        //System.out.println("El total a cobrar es de:" + " " + totalACobrar);



    }


    public static void agregarHoras(ArrayList<Integer> horasTrabajadas) {
        horasTrabajadas.add(Integer.valueOf(String.valueOf(2)));
        horasTrabajadas.add(Integer.valueOf(String.valueOf(2)));
        horasTrabajadas.add(Integer.valueOf(String.valueOf(2)));
        horasTrabajadas.add(Integer.valueOf(String.valueOf(2)));
        horasTrabajadas.add(Integer.valueOf(String.valueOf(2)));

    }

    public static void agregarValorHora(ArrayList<Integer> valorPorHora) {
        valorPorHora.add(Integer.valueOf(String.valueOf(1)));
        valorPorHora.add(Integer.valueOf(String.valueOf(2)));
        valorPorHora.add(Integer.valueOf(String.valueOf(3)));
        valorPorHora.add(Integer.valueOf(String.valueOf(4)));
        valorPorHora.add(Integer.valueOf(String.valueOf(5)));


    }


}
