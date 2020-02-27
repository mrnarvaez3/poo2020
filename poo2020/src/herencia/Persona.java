package herencia;

/**
 * Clase principal o superclase
 */
public class Persona {

    // Atributos comunes para todas las clases
    protected String nombre;
    protected String indetificacion;
    protected String estadoCivil;
    protected String fechaNac;


    public void venirUni() {
        System.out.println("Metodo para venir Univeraidad");;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndetificacion() {
        return indetificacion;
    }

    public void setIndetificacion(String indetificacion) {
        this.indetificacion = indetificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
