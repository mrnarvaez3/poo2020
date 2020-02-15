package disenio_repeticion;
import java.util.Scanner;

public class Ejecuta_EmpleadoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de variables
        String nombre;
        int horas;
        double cuota;
        int salir;
        int limite = 1;
        System.out.println("Ingrese la cuota por hora a pagar: ");
        cuota = teclado.nextDouble();
        for (int x = 1; x <= limite; x++){
            // Entrada de datos
            teclado.nextLine();
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
            if(salir  == 1){
                limite = limite+1;
            } else{
                limite = x;
            }
        }
    }
}