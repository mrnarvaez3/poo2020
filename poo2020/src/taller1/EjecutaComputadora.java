package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("Asus");
        computadora.actualizar_color("black-red");
        computadora.actualizar_generacion("Octava");
        computadora.actualizar_peso(20);
        computadora.actualizar_procesador("i78550U");



        String mostrar_computadora = computadora.obtener_computadora();
        System.out.println(mostrar_computadora);
    }
}
