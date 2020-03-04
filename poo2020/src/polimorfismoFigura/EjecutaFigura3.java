package polimorfismoFigura;
import herenciaFigura.Circulo;
import herenciaFigura.Cuadrado;
import herenciaFigura.Rectangulo;
import herenciaFigura.Triangulo;

import java.util.Scanner;
public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String nombre;
        int opcion =1;
        double baseTria, alturaTria, lado, radio, baseRec, alturaRec;
        do {
            // Solicitud y lectura de datos
            System.out.println("Digite una figura:\nTriangulo\nCuadrado" +
                    "\nCirculo\nRectangulo");
            nombre = teclado.nextLine();

            switch (nombre) {
                case "triangulo":
                    System.out.println("Ingrese la base del triangulo");
                    baseTria = teclado.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    alturaTria = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Triangulo3 triangulo3 = new Triangulo3(baseTria, alturaTria, nombre);
                    triangulo3.calcularArea();
                    // Salida de datos
                    System.out.printf("Figura: %s\nArea: %.2f", triangulo3.getNombre(), triangulo3.getArea());
                    break;
                case "cuadrado":
                    System.out.println("Ingrese el lado del cuadrado: ");
                    lado = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Cuadrado3 cuadrado3 = new Cuadrado3(lado, nombre);
                    cuadrado3.calcularArea();
                    // Salida de datos
                    System.out.printf("Figura: %s\nArea: %.2f", cuadrado3.getNombre(), cuadrado3.getArea());
                    break;
                case "circulo":
                    System.out.println("Ingrese el radio del circulo: ");
                    radio = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Circulo3 circulo3 = new Circulo3(radio, nombre);
                    circulo3.calcularArea();
                    // Salida de datos
                    System.out.printf("Figura: %s\nArea: %.2f", circulo3.getNombre(), circulo3.getArea());
                    break;
                case "rectangulo":
                    System.out.println("Ingrese la base del rectangulo");
                    baseRec = teclado.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo");
                    alturaRec = teclado.nextDouble();

                    // creacion objeto Triangulo
                    Rectangulo3 rectangulo3 = new Rectangulo3(baseRec, alturaRec, nombre);
                    rectangulo3.calcularArea();
                    // Salida de datos
                    System.out.printf("Figura: %s\nArea: %.2f", rectangulo3.getNombre(), rectangulo3.getArea());
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println("\nDesea ingresar otra figura?\n1.Si\n2.No");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 2){
                opcion = 2;
            }
        }while (opcion == 1);
    }
}
