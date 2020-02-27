package herencia_empleado;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // declaracion de variables
        String nombre, cargo, dependencia;
        double valorMensual, sueldo, valorHora;
        int hora, opcion;

        //  para diferenciar que objeto llamar
        System.out.println("Ingrese una opcion\n1.Sueldo por horas\n2.Sueldo fijo mensual");
        opcion = teclado.nextInt();
        teclado.nextLine();
        //  solicitud y lectura de datos
        switch (opcion){
            case 1:
                System.out.println("Ingrese su nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese su dependencia: ");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el numero de horas trabajadas:");
                hora = teclado.nextInt();
                System.out.println("Ingrese el valor por hora");
                valorHora = teclado.nextInt();
                //  Creacion del objeto Empleado por hora
                EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(nombre, cargo, dependencia, hora, valorHora);
                //  salida de datos
                empleadoPorHora.presentar();
                break;
            case 2:
                System.out.println("Ingrese su nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese su cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese su dependencia: ");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el valor mensual a pagar:");
                valorMensual = teclado.nextDouble();
                //  Creacion del objeto Empleado Asalariado
                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(valorMensual,nombre, cargo, dependencia);
                //  Salida de datos
                empleadoAsalariado.presentar();
                break;
        }
    }
}
