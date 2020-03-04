package polimorfismoPoo;

public class EmpleadoAsalariado2 extends Empleado12{
    double salarioMen;

    public EmpleadoAsalariado2(double salarioMen){
        this.salarioMen = salarioMen;
    }

    /**
     * Implementacion del metodo abstracto
     * que fue definido en la clase padre
     */
    @Override
    public void calcularSueldo() {
    sueldo = salarioMen/2;
    }
}
