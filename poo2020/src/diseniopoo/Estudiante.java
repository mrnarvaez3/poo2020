package diseniopoo;

public class Estudiante {
    private String nombre;
    private String materia;
    private double nota1;
    private double nota2;

    // contructor
    public Estudiante (String nombre, double nota1, double nota2, String materia){
        this.materia = materia;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
   /**
     * metodo para evaluar nota final
     * @param nota1
     * @param nota2
     * @return
     */
    public String obtener_pase(double nota1, double nota2){
        String pase;
        double suma = nota1 + nota2;
        if (suma >=28){
            pase = "Si pasa la materia, sin rendir Supletorio";
        } else {
            pase = "No pasa la materia, debe rendir supletorio";
        }
        return pase;
    }

    /**
     * metodo para presentar salida de datos
     * @return cadena
     */
    public String presentar() {
        String cadena = String.format("El alumno: %s\nEn la materia: %s\n" +
                        "Con las notas:\n1er Bim: %.2f\n2do Bim: %.2f\nNota Final: %.2f \n%s"
                , nombre, materia, nota1, nota2, nota1 + nota2, obtener_pase(this.nota1, this.nota2));
        return cadena;
    }
}
