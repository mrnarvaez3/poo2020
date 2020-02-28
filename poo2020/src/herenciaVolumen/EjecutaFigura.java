package herenciaVolumen;
import java.util.Scanner;

public class EjecutaFigura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String nombre;
        double arista, radioCili, alturaCili, radioCono, alturaCono, radioEsfera;
        int opcion, bandera;
        // Solicitud y lectura de datos
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

                    // creacion objeto Triangulo
                    Cubo cubo = new Cubo(arista, nombre);
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cubo.getNombre(), cubo.volumenCubo());
                    break;
                case 2:
                    nombre = "Cilindro";
                    System.out.println("Ingrese el radio del cilindro");
                    radioCili = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cilindro");
                    alturaCili = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Cilindro cilindro = new Cilindro(radioCili, alturaCili, nombre);
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cilindro.getNombre(), cilindro.volumenCilindro());
                    break;
                case 3:
                    nombre = "Cono";
                    System.out.println("Ingrese el radio del cono");
                    radioCono = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cono");
                    alturaCono = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Cono cono = new Cono(radioCono, alturaCono, nombre);
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", cono.getNombre(), cono.volumenCono());
                    break;
                case 4:
                    nombre = "Esfera";
                    System.out.println("Ingrese el radio de la esfera");
                    radioEsfera = teclado.nextDouble();
                    // creacion objeto Triangulo
                    Esfera esfera = new Esfera(radioEsfera, nombre);
                    // Salida de datos
                    System.out.printf("Figura: %s\nVolumen: %.2f", esfera.getNombre(), esfera.volumenEsfe());
                    break;
                case 5:
                    bandera = 2;
                    System.out.println("Fin del programa");
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
