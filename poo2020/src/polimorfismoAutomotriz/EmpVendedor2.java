package polimorfismoAutomotriz;

// Clase hija de Empleado
public class EmpVendedor2 extends Empleado2 {
    double ventas;

    /**
     * Metodo constructor
     * @param ventas
     * @param nombre
     * @param departamento
     * @param puesto
     */
    public EmpVendedor2(double ventas, String nombre, String departamento, String puesto ){
        this.ventas = ventas;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;

    }

    /**
     * Metodo para obtener la quincena
     * @return quincena
     */

    @Override
    public void calcularQuincena() {
        quincena = 400 + (ventas * 0.02);

    }
}
