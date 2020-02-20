package arreglosdeberpoo;

public class Estudiante {
    //  declaracion de variables
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String cadena = "";

    /**
     * Metodo constructor para el objeto estudiante
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public Estudiante(String[] nombre, int[] edad, String[] universidad, String[] celular){
        this.celular = celular;
        this.edad = edad;
        this.nombre = nombre;
        this. universidad = universidad;
    }

    /**
     * Metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar() {
        for (int i = 0; i < 5; i++) {
            cadena = String.format("%sNombre: %s\nEdad: %d\nUniversidad: %s " +
                    "\nCelular: %s\n\n\n", cadena, nombre[i], edad[i], universidad[i], celular[i]);
        }
        return cadena;
    }
}
