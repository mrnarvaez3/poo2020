package diseniopoo;
import java.util.Scanner;

public class EjecutaCerveza {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // entrada de datos
        System.out.println("Nombre de la cerveza: ");
        String nombre  = teclado.nextLine();
        System.out.println("Tipo de la cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese el costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Numero de unidades vendidas: ");
        int unidades_vendidas = teclado.nextInt();
        //  creacion de objeto
        Cerveza cerveza = new Cerveza(precio, unidades_vendidas, tipo, nombre);
        // salida de datos
        System.out.println(cerveza.presentar());

    }


}
