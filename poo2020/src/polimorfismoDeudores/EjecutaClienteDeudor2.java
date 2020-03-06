package polimorfismoDeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor2 {
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
                    PrestamoPersonal2 pA = new PrestamoPersonal2(nombre, numeroCu, capital, plazo);
                    pA.calcularinteres();
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pA.getInteres());
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
                    PrestamoHipotecario2 pH = new PrestamoHipotecario2(nombre, numeroCu, capital, plazo);
                    pH.calcularinteres();
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pH.getInteres());
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
                    PrestamoAuto2 pAuto = new PrestamoAuto2(nombre, numeroCu, capital, plazo);
                    pAuto.calcularinteres();
                    // ACUMULACIÓN DE CADENAS PARA OBTENCION DE SALIDA DE DATOS
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombre, numeroCu
                            , pAuto.getInteres());
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
