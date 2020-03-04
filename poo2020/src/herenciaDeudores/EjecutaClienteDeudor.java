package herenciaDeudores;
import herenciaInversionistas.CuentaAhorro;
import herenciaInversionistas.CuentaMaestra;
import herenciaInversionistas.Pagare;

import java.util.Scanner;
public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numeroCu, nombre;
        String cadena = "\t\t\t\tREPORTE DE CLIENTES DEUDORES\nNo. Cliente\t\t\tNombre\t\tNo. Cuenta\t\tInterés por pagar\n" +
                "----------------------------------------------------------------\n";
        double capital;
        int bandera = 1;
        int opcion, plazo;
        int cont = 0;
        do {
            System.out.println("------------------------------");
            System.out.println("Digite una opción:");
            System.out.println("1. PRESTAMO PERSONAL");
            System.out.println("2. PRESTAMO HIPOTECARIO");
            System.out.println("3. PRESTAMO AUTOMOVIL");
            System.out.println("4. SALIR");
            System.out.println("------------------------------");

            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                bandera = 2;
            }
            switch (opcion) {
                case 1:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextInt();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoPersonal pA = new PrestamoPersonal(nombre, numeroCu, capital, plazo);
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pA.obtenerInteres());
                    break;
                case 2:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextInt();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoHipotecario pH = new PrestamoHipotecario(nombre, numeroCu, capital, plazo);
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pH.obtenerInteres());
                    break;
                case 3:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el capital prestado");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextInt();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoAuto pAuto = new PrestamoAuto(nombre, numeroCu, capital, plazo);
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pAuto.obtenerInteres());
                    break;
                case 4:
                    System.out.println("---- GRACIAS ----");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }while (bandera == 1);
        System.out.printf("%s\nTOTAL %d CLIENTES\n",cadena,cont);

    }
}
