package disenio_repeticion;
import java.util.Scanner;

public class Ejecuta_EmpleadoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de variables
        String nombre;
        int horas;
        double cuota;
        double sueldo;
        int salir = 1;
        System.out.println("Ingrese la cuota por hora a pagar: ");
        cuota = teclado.nextDouble();
        teclado.nextLine();
        while(salir ==1 ){
            salir = 0;
            // Entrada de datos
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            horas = teclado.nextInt();

            // Creacion del objeto
            Empleado empleado = new Empleado(nombre, horas);

            // salida de datos
            System.out.printf("Nombre: %s\nSueldo: %.2f $S\n", empleado.nombre, empleado.establecerSueldo(cuota));

            //  validacion para nuevo ingreso de datos
            System.out.println("Desea seguir ingresando datos?\n1.Si\n2.No");
            salir = teclado.nextInt();
            teclado.nextLine();
        };
    }
}