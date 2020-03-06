package polimorfismoVolumen;

import java.util.Scanner;

public class EjecutaFigura2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String nombre;
        double arista, radioCili, alturaCili, radioCono, alturaCono, radioEsfera;
        int opcion, bandera;
        // Ciclo para la Solicitud y lectura de datos
        do {
            System.out.println("----------------------------");
            System.out.println("VOLUMEN FIGURAS GEOMETRICAS");
            System.out.println("Digite una figura:\n1. Cubo\n2. Cilindro" +
                    "\n3. Cono\n4. Esfera\n5. Fin");
            System.out.println("----------------------------");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    nombre = "Cubo";
                    System.out.println("Ingrese la arista del cubo");
                    arista = teclado.nextDouble();

                    // creacion objeto Cubo
                    Cubo2 cubo2 = new Cubo2(arista, nombre);
                    cubo2.calcularVol();
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cubo2.getNombre(), cubo2.getVol());
                    break;
                case 2:
                    nombre = "Cilindro";
                    System.out.println("Ingrese el radio del cilindro");
                    radioCili = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cilindro");
                    alturaCili = teclado.nextDouble();

                    // creacion objeto Cilindro
                    Cilindro2 cilindro2 = new Cilindro2(radioCili, alturaCili, nombre);
                    cilindro2.calcularVol();
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cilindro2.getNombre(), cilindro2.getVol());
                    break;
                case 3:
                    nombre = "Cono";
                    System.out.println("Ingrese el radio del cono");
                    radioCono = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cono");
                    alturaCono = teclado.nextDouble();

                    // creacion objeto Cono
                    Cono2 cono2 = new Cono2(radioCono, alturaCono, nombre);
                    cono2.calcularVol();
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cono2.getNombre(), cono2.getVol());
                    break;
                case 4:
                    nombre = "Esfera";
                    System.out.println("Ingrese el radio de la esfera");
                    radioEsfera = teclado.nextDouble();
                    // creacion objeto Esfera
                    Esfera2 esfera2 = new Esfera2(radioEsfera, nombre);
                    esfera2.calcularVol();
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", esfera2.getNombre(), esfera2.getVol());
                    break;
                case 5:

                    System.out.println("Fin del programa");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("\nDesea ingresar mas figuras?\n1.Si\n2.No");
            bandera  = teclado.nextInt();
            if (bandera == 2){
                bandera = 2;
            }
        }while (bandera == 1);
    }
}
