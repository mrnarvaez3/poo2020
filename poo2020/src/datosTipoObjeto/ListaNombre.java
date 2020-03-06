package datosTipoObjeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int bandera = 1;
        String nombre;

        List<String> nombres = new ArrayList<String>();
        do {
            System.out.println("------------------------------------");
            System.out.println("Ingrese una opcion:\n1.Agregar un nuevo nombre\n2.Presentar lista de nombres\n3.Salir");
            System.out.println("------------------------------------");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un nombre:");
                    nombre = teclado.nextLine();
                    nombres.add(nombre);
                    break;
                case 2:
                    System.out.println(nombres);
                    break;
                case 3:
                    bandera = 2;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Desea continuar?\n1.Si\n2.No");
            bandera = teclado.nextInt();
            if (bandera == 2) {
                bandera = 2;
            }
        } while (bandera == 1);
    }
}