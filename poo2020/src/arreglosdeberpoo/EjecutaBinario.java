package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        String numero;

        //  solicitud y lectura de datos
        System.out.println("Digite un numero");
        numero = entrada.nextLine();

        // creacion del objeto
        Binario binario = new Binario(numero);

        //  salida de datos
        System.out.println("Numero en binario: "+ numero);
        System.out.println("Numero  en decimal: "+binario.calcularDecimal());

    }
}