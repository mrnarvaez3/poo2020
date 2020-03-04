package polimorfismoPoo;

public class EmpleadoPorHoras2 extends Empleado12{
    private double horas;
    private double cuota;

    // tambien se extienden los atributos de la clase padre


    public EmpleadoPorHoras2(double horas, double cuota){
        this.horas = horas;
        this.cuota = cuota;
    }

    @Override
    public void calcularSueldo() {
        sueldo = cuota * horas;
    }


    // tambien se extienden los metodos de la clase padre

}
