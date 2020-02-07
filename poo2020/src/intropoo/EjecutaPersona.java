package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {

        // creacion deo jeto con inicializacion de variables
        Persona persona = new Persona("Masculino", "Catolica",
                "Roberto", 21);
        // Salida de datos
        System.out.printf("Nombre: %s\nGenero: %s\nReligion: %s\nEdad: %d"
                ,persona.getNombre(), persona.getGenero(),
                persona.getReligion(), persona.getEdad());

        Persona persona2 = new Persona("Masculino", "Catolica","Roberto");
        Persona persona3 = new Persona("Femenino", "Ateo","Joan");

        System.out.println("\nNombre persona 2:" + persona2.getNombre());
        System.out.println("Nombre persona 3:" + persona3.getNombre());

    }

}
