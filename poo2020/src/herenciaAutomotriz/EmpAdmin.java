package herenciaAutomotriz;

public class EmpAdmin extends Empleado{

    double sueldoMensual, quincena;

    public EmpAdmin(double sueldoMensual, String nombre, String departamento, String puesto ){
        this.sueldoMensual = sueldoMensual;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public double quincenaAdmin(){
        quincena = sueldoMensual/2;
        return quincena;
    }
}
