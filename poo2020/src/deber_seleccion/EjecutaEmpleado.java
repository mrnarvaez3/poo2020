package deber_seleccion;
import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de variables
        String nombre;
        int horas;
        double cuota;
        double sueldo;
        int salir;
        do{
            salir = 0;
            // Entrada de datos
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = teclado.nextLine();
            System.out.println("Ingrese las horas trabajadas: ");
            horas = teclado.nextInt();
            System.out.println("Ingrese la cuota por hora a pagar: ");
            cuota = teclado.nextDouble();

            // Creacion del objeto
            Empleado empleado = new Empleado(nombre, horas, cuota);
            // salida de datos
            System.out.println(empleado.presentar());
            System.out.println("Desea seguir ingresando datos?\n1.Si\n2.No");
            salir = teclado.nextInt();
            teclado.nextLine();
        }while (salir  ==  1);
    }
}
