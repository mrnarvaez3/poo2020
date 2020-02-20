package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //  declaracion de variables
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        String cadenaFinal = "";

        // entrada y lectura de datos
        for (int i = 0; i < 5; i++) {
            System.out.printf("Datos del estudiante %d", i+1);
            System.out.println("\nIngrese el nombre del estudiante:");
            nombre[i] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            edad[i] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese la universidad del estudiante: ");
            universidad[i] = teclado.nextLine();
            System.out.println("Ingrese el numero de celular del estudiante:");
            celular[i] = teclado.nextLine();
        }
        // creacion del objeto
        Estudiante estudiante = new Estudiante(nombre, edad, universidad, celular);

        // salida de datos
        System.out.println(estudiante.presentar());
    }

}
