package herencia;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, identificacion, estado_civil, fechaNac, carrera, area, dependencia;
        System.out.println("Ingrese una opcion:\n1.Estudiante\n2.Docente\n3.Administrativo");
        int opcion = entrada.nextInt();
        entrada.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese la carrera: ");
                carrera = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fechaNac = entrada.nextLine();
                // Creacion de objeto de la clase Estudiante
                Estudiante estudiante = new Estudiante(carrera, nombre, estado_civil, identificacion, fechaNac);
                estudiante.presentar();
                break;
            case 2:
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese el area: ");
                area = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fechaNac = entrada.nextLine();
                // Creacion de objeto de la clase Estudiante
                Docente docente = new Docente(area, nombre, estado_civil, identificacion, fechaNac);

                break;
            case 3:
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                identificacion = entrada.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fechaNac = entrada.nextLine();
        }

    }
}
