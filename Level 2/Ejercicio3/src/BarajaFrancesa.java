import java.util.*;

public class BarajaFrancesa {

    public static void main(String[] arg) {
        ArrayList<String> baraja = new ArrayList();
        baraja.add("1");
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");

        System.out.println(baraja);

        for (int i = baraja.size() - 1; i >= 0; i--) {
            System.out.print((baraja.get(i)) + "  ");
        }

        System.out.println();

        Random r = new Random();


        for (int i = 0; i < baraja.size(); i++) {
            int posAleatoria = r.nextInt(baraja.size());
            int temp = Integer.parseInt(baraja.get(i));
            baraja.set(i, baraja.get(posAleatoria));
            baraja.set(posAleatoria, String.valueOf(temp));
        }

        System.out.println(Arrays.toString(new ArrayList[]{baraja}));


    }
}



