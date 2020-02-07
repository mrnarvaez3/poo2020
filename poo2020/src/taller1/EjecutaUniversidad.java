package taller1;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Universidad universidad = new Universidad();
        universidad.actualizar_carrera("Ciencias de la computacion");
        universidad.actualizar_departamento("Area tecnica");
        universidad.actualizar_administrativo("Pedro Gonzalez");
        universidad.actualizar_docente("Alex Lorenzo");
        universidad.actualizar_estudiante("Roberto Narvaez");



        String mostrar_universidad = universidad.obtener_universidad();
        System.out.println(mostrar_universidad);
    }
}
