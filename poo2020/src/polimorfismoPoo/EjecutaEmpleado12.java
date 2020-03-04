package polimorfismoPoo;

import java.util.Scanner;

public class EjecutaEmpleado12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horas;
        double cuota;
        double salarioMen;

        // Obtener el suendo quincenal de un empleado por horas

        System.out.println("Calculo suendo quincenal empleado por horas");

        System.out.println("Ingrese horas trabajadas");
        horas = teclado.nextDouble();
        System.out.println("Ingrese la cuota por hora:");
        cuota = teclado.nextDouble();
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2(horas, cuota);

        empHoras.calcularSueldo();

        System.out.println("El sueldo quincenal es " + empHoras.getSueldo());




        System.out.println("Calculo suendo quincenal empleado Asalariado");

        System.out.println("Ingrese sueldo mensual");
        salarioMen = teclado.nextDouble();
        EmpleadoAsalariado2 empAsa = new EmpleadoAsalariado2(salarioMen);

        empAsa.calcularSueldo();

        System.out.println("El sueldo quincenal es " + empAsa.getSueldo());


    }
}
