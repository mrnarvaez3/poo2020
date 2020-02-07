package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Docente docente = new Docente();
        docente.actualizar_nombre("Roberto Roman");
        docente.actualizar_numero_cedula("0704692532");
        docente.actualizar_numero_celular("0996189517");
        docente.actualizar_fecha_nacimiento("04/08/98");
        docente.actualizar_correo("mrnarvaez3@gmail.com");



        String mostrar_docente = docente.obtener_docente();
        System.out.println(mostrar_docente);
    }
}
