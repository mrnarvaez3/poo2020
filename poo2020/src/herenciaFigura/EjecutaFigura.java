package herenciaFigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        String nombre;
        double baseTria, alturaTria, lado, radio, baseRec, alturaRec;

        // Solicitud y lectura de datos
        System.out.println("Digite una figura:\nTriangulo\nCuadrado" +
                "\nCirculo\nRectangulo");
        nombre = teclado.nextLine();

        switch (nombre){
            case "triangulo":
                System.out.println("Ingrese la base del triangulo");
                baseTria = teclado.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                alturaTria = teclado.nextDouble();

                // creacion objeto Triangulo
                Triangulo triangulo = new Triangulo(baseTria, alturaTria, nombre);
                // Salida de datos
                System.out.printf("Figura: %s\nArea: %.2f",triangulo.getNombre(),triangulo.calcularAreaTria());
                break;
            case "cuadrado":
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = teclado.nextDouble();

                // creacion objeto Triangulo
                Cuadrado cuadrado = new Cuadrado(lado, nombre);
                // Salida de datos
                System.out.printf("Figura: %s\nArea: %.2f", cuadrado.getNombre(),cuadrado.obtenerAreaCua());
                break;
            case "circulo":
                System.out.println("Ingrese el radio del circulo: ");
                radio = teclado.nextDouble();

                // creacion objeto Triangulo
                Circulo circulo = new Circulo(radio, nombre);
                // Salida de datos
                System.out.printf("Figura: %s\nArea: %.2f", circulo.getNombre(),circulo.obtenerAreaCir());
                break;
            case "rectangulo":
                System.out.println("Ingrese la base del rectangulo");
                baseRec = teclado.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                alturaRec = teclado.nextDouble();

                // creacion objeto Triangulo
                Rectangulo rectangulo = new Rectangulo(baseRec, alturaRec, nombre);
                // Salida de datos
                System.out.printf("Figura: %s\nArea: %.2f", rectangulo.getNombre(),rectangulo.obtenerAreaRec());
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
