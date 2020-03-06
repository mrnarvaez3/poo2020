package datosTipoObjeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //  Declaracion de variables
    String nombre, cedula, carrera, correo;
    int edad;
    int acum = 0;
    int cont, opcion;
    int bandera = 1;
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    Estudiante estudiante;

        do {
            System.out.println("INGRESO DE NUEVO ESTUDIANTE:");
            System.out.println("Ingrese el nombre del estudiante");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la cedula del estudiante");
            cedula = teclado.nextLine();
            System.out.println("ingrese la carrera del estudiante");
            carrera = teclado.nextLine();
            System.out.println("ingrese el correo del estudiante");
            correo = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edad = teclado.nextInt();
            teclado.nextLine();
            Estudiante est = new Estudiante(nombre, cedula, carrera, correo, edad);

            //  Asignamos el objeto est al arregloEstudiante
            listaEstudiantes.add(est);
            System.out.println("Desea continuar?\n1.Si\n2.No");
            bandera = teclado.nextInt();
            if (bandera == 2) {
                bandera = 2;
            }
        } while (bandera == 1);
        System.out.println("LISTA DE ESTUDIANTES ");
        for (Estudiante est: listaEstudiantes){
            System.out.println("---------------------------------");

            System.out.println("Nombre:" + est.getNombre());
            System.out.println("Cedula:" + est.getCedula());
            System.out.println("Carrera:" + est.getCarrera());
            System.out.println("Correo:" + est.getCorreo());
            System.out.println("Edad:" + est.getEdad());
            System.out.println("---------------------------------");
        }
        
        System.out.println("FIN DEL PROGRAMA");
}
}
