package datosTipoObjeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {


        //  Creacion de una lista en java
        //  para almacenar valores de tipo String

        List<String> universidades = new ArrayList<String>();

        universidades.add("UTPL");
        universidades.add("ESPOL");
        universidades.add("UNL");
        System.out.println(universidades);
        System.out.println(universidades.size());
        //  elimincion del elemento en la posicion 1
        universidades.remove(1);
        System.out.printf("lista luego de eliminar: %s\n", universidades);
        universidades.set(1,"UIDE");
        universidades.add(1, "UNL");
        for (String uni: universidades){
            System.out.println(uni);
        }
        /*
        for (int i = 0; i < universidades.size(); i++) {
            System.out.printf("Elemento  %d: %s\n", i, universidades.get(i));
        }
        */

    }
}
