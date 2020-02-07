package intropoo;

public class Persona {
    private String genero;
    private String religion;
    private int edad;
    private String nombre;


    /**
     * Metodo constructor de la clase Persona
     * @param genero
     * @param religion
     * @param nombre
     * @param edad
     */
    public Persona (String genero, String religion, String nombre, int edad){
        this.genero = genero;
        this.religion = religion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona (String genero, String religion, String nombre){
        this.genero = genero;
        this.religion = religion;
        this.nombre = nombre;
    }




    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
