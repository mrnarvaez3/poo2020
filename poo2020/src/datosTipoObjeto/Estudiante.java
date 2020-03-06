package datosTipoObjeto;

public class Estudiante {
    private String nombre;
    private String cedula;
    private String carrera;
    private String correo;
    private int edad;


    public Estudiante(String nombre, String cedula, String carrera, String correo, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.correo = correo;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
