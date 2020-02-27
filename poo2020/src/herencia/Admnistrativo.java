package herencia;

public class Admnistrativo extends Persona{
    // Atributos propios de la clase Administrativo
    private String dependencia;

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void gestionar() {
        System.out.println("Metodo para gestionar");
    }
    public void presentar(){
        System.out.println("-------------------------------");
        System.out.printf("Nombre: %s\nIdentificacion: %s\nDependencia: %s\nEstado civil: %s\nFecha nacimiento: %s"
                ,getNombre(), getIndetificacion(), getDependencia(),
                getEstadoCivil(),getFechaNac());
    }
}
