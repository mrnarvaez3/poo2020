package polimorfismoInversionistas;

import java.util.Scanner;

public class EjecutaInversionista2 {
    public static void main(String[] args) {

        // Declaracion e inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        String nombreCu, numeroCu;
        String cadena = "\t\t\t\tREPORTE INVERSIONITAS\nNo. Cliente\t\t\tNombre\t\tNo. Cuenta\t\tInterés Ganado\n" +
                "----------------------------------------------------------\n";
        double capitalInt, plazo;
        int bandera = 1;
        int opcion;
        int cont = 0;
        // Ciclo para el ingreso y lectura de datos
        do {
            System.out.println("------------------------------");
            System.out.println("Digite una opción:");
            System.out.println("1. CUENTA DE AHORRO");
            System.out.println("2. CUENTA MAESTRA");
            System.out.println("3. PAGARE");
            System.out.println("4. SALIR");
            System.out.println("------------------------------");

            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                bandera = 2;
            }
            //  Dependiendo de la eleccion del usuario se obtendra datos diferentes y seran almacenados en una cadena
            switch (opcion) {
                case 1:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreCu = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalInt = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaAhorro2 cA = new CuentaAhorro2(numeroCu, capitalInt, nombreCu, plazo);
                    cA.obtenerIntereses();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombreCu, numeroCu
                            , cA.getIntereses());
                    break;
                case 2:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreCu = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalInt = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaMaestra2 cM = new CuentaMaestra2(numeroCu, capitalInt, nombreCu, plazo);
                    cM.obtenerIntereses();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombreCu, numeroCu
                            , cM.getIntereses());
                    break;
                case 3:
                    cont += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroCu = teclado.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreCu = teclado.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalInt = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = teclado.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    Pagare2 pg = new Pagare2(numeroCu, capitalInt, nombreCu, plazo);
                    pg.obtenerIntereses();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.2f\n", cadena, cont, nombreCu, numeroCu
                            , pg.getIntereses());
                    break;
                case 4:
                    System.out.println("---- GRACIAS ----");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }while (bandera == 1);
        //  Salida de datos
        System.out.printf("%s\nTOTAL %d INVERSIONES\n",cadena,cont);
    }
}
