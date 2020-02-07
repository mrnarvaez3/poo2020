package taller1;

import intropoo.Tiempo;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Roberto Narvaez");
        estudiante.actualizar_numero_cedula("0704692532");
        estudiante.actualizar_fechaNacimiento("04/08/98");
        estudiante.actualizar_edad(21);
        estudiante.actualizar_correo("mrnarvaez3@gmail.com");



        String mostrar_estudiante = estudiante.obtener_estudiante();
        System.out.println(mostrar_estudiante);
    }
}
