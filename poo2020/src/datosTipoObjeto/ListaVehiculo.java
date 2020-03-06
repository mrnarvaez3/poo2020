package datosTipoObjeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String placa;
        String marca;
        int anio, opcion;
        int bandera = 1;
        String color;
        String modelo;
        double cilindraje;
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        Vehiculo vehiculo;
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        do{
            System.out.println("------------------------------------");
            System.out.println("Ingrese una opcion:\n1.Agregar un nuevo vehiculo\n2.Presentar vehiculos\n3.Salir");
            System.out.println("------------------------------------");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la placa del vehiculo");
                    placa = teclado.nextLine();
                    System.out.println("Ingrese la marca del vehiuclo");
                    marca  = teclado.nextLine();
                    System.out.println("Ingrese el modelo del vehiuclo");
                    modelo = teclado.nextLine();
                    System.out.println("Ingrese el color del vehiuclo");
                    color  = teclado.nextLine();
                    System.out.println("Ingrese el anio del vehiuclo");
                    anio  = teclado.nextInt();
                    System.out.println("Ingrese el cilindraje del vehiuclo");
                    cilindraje  = teclado.nextDouble();
                    Vehiculo vehiculo1 = new Vehiculo(placa,marca, anio, color, modelo, cilindraje);
                    // agregamos objeto vehiculo1 a la lista
                    vehiculos.add(vehiculo1);
                    break;
                case 2:
                    System.out.println("Placa\tMarca\tCilindraje");
                    for (Vehiculo v:vehiculos){
                        System.out.printf("%s\t\t%s\t\t%.2f\n",v.getPlaca(),v.getMarca(), v.getCilindraje());
                    }
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
        }while (bandera == 1);


    }
}
