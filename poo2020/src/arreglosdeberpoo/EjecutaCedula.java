package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cedula1;
        // Lectura y solicitud de datos
        System.out.println("Ingrese el numero de cedula:");
        cedula1 = teclado.nextLine();

        // Creacion del objeto cedula
        Cedula cedula = new Cedula(cedula1);

        // Salida de datos
        System.out.printf("Su numero de cedula: %s\n%s", cedula1, cedula.verificarCedula());


    }
}
