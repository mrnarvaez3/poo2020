package polimorfismoPoo;

public abstract class Empleado12 {
    // Definicion de atributos protefgiso para que pueda heredar


    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo;

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

    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo que sera implementado
     * dentro de las clases hijas.
     */
    public abstract void calcularSueldo();

}
