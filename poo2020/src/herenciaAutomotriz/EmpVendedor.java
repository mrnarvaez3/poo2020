package herenciaAutomotriz;

public class EmpVendedor extends Empleado{
    double ventas, quincena;

    public EmpVendedor(double ventas, String nombre, String departamento, String puesto ){
        this.ventas = ventas;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;

    }


    public double quincenaVendedor(){
        quincena = 400 + (ventas * 0.02);
        return quincena;
    }
}
