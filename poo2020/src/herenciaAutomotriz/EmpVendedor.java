package herenciaAutomotriz;
// Clase hija de Empleado
public class EmpVendedor extends Empleado{
    double ventas, quincena;

    /**
     * Metodo constructor
     * @param ventas
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpVendedor(double ventas, String nombre, String departamento, String puesto ){
        this.ventas = ventas;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;

    }

    /**
     * Metodo para obtener la quincena
     * @return quincena
     */
    public double quincenaVendedor(){
        quincena = 400 + (ventas * 0.02);
        return quincena;
    }
}
