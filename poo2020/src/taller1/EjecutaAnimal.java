package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Animal animal = new Animal();
        animal.actualizar_nombre("Perro");
        animal.actualizar_especie("Canino");
        animal.actualizar_region("Inglatera");
        animal.actualizar_sexo("Macho");
        animal.actualizar_tipo("Cuadrupedo");



        String mostrar_animal = animal.obtener_animal();
        System.out.println(mostrar_animal);
    }
}
