package datosTipoObjeto;
import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //  Declaracion de variables
        String nombre, cedula, carrera, correo;
        int edad;
        int acum = 0;
        int cont, opcion;
        Estudiante arregloEstudiante[] = new Estudiante[3];

        Estudiante estudiante;
        boolean bandera = true;

        for (cont = 0; cont < arregloEstudiante.length; cont++) {
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
            arregloEstudiante[cont] = est;
        }
        System.out.println("LISTA DE ESTUDIANTES ");
        System.out.println("Nombre\tCedula");
        for (cont = 0; cont < arregloEstudiante.length; cont++) {
            System.out.println(arregloEstudiante[cont].getNombre() + "\t" + arregloEstudiante[cont].getCedula()+"\t");
            acum += arregloEstudiante[cont].getEdad();
        }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: " + acum/arregloEstudiante.length);
        System.out.println("FIN DEL PROGRAMA");
    }
}
