package polimorfismoAutomotriz;
// Clase maestra Empleado

public abstract class Empleado2 {
    //  Declaracion de variables
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double quincena;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getQuincena() {
        return quincena;
    }

    public abstract void calcularQuincena();

}