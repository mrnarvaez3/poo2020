package disenio_seleccion;
import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        //  Declaracion de variables
       String estadoDia;
       int numeroDia;
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inrese el numero del dia que desee: ");
        numeroDia = teclado.nextInt();


        // Creacion del objeto
        Dia dia = new Dia(numeroDia);

        //Salida de datos
        System.out.println(dia.presentar());
    }
}
