package taller_repeticion;
import java.util.Scanner;
public class MiEjecuta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         String nombre;
         double sueldoInicial;
         int opcion;
         int bandera = 1;

        System.out.println("Ingrese su nombre por favor: ");
         nombre = teclado.nextLine();
        System.out.println("Ingrese su saldo inicial por favor: ");
        sueldoInicial = teclado.nextDouble();
        MiCajero miCajero = new MiCajero(nombre, sueldoInicial);
        do {
            System.out.println("Ingrese una opcion: \n1. Depositar\n2. Retirar\n3. Consultar saldo");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuanto desea depositar?");
                    double deposito = teclado.nextDouble();
                    miCajero.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    double retiro = teclado.nextDouble();
                    miCajero.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Su salfo es de :"+ miCajero.getSueldoInicial());;
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
            do {
                System.out.println("Desea Continuar? \n1.Si\n2.No");
                bandera = teclado.nextInt();

                if (bandera == 2) {
                    bandera = 2;
                }
            }while (bandera != 1 && bandera != 2);

        }while(bandera == 1);

    }
}
