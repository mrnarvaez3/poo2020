package diseniopoo;
import java.util.Scanner;
public class EjecutaEstudiante {

    public static void main(String[] args) {
         //  Declaracion de variables
         String nombre;
         String materia;
         double nota1;
         double nota2;

        Scanner teclado = new Scanner(System.in);
        // Entrada de datos
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la materia del estudiante: ");
        materia = teclado.nextLine();
        System.out.println("Ingrese la nota del primer bimestre: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la nota del segundo bimestre: ");
        nota2 = teclado.nextDouble();

        // Creacion del objeto
        Estudiante estudiante = new Estudiante(nombre, nota1, nota2, materia);

        //Salida de datos
        System.out.println(estudiante.presentar());

    }
}
