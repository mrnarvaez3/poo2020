package disenio_seleccion;
public class Dia {

    // delcaracion de variables
    private String estadoDia;
    private int numeroDia;

    //   gets y set del objeto Dia
    public String getEstadoDia() {
        return estadoDia;
    }

    public void setEstadoDia(String estadoDia) {
        this.estadoDia = estadoDia;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    // constructor objeto Dia
    public Dia( int numeroDia1){
        numeroDia = numeroDia1;
    }

    /**
     * metodo para obtener el dia en cadena
     * @return estadoDia
     */
    public String obtener_dia(){
        switch (numeroDia){
            case 1:
                estadoDia = ("Domingo");
                break;
            case 2:
                estadoDia = ("Lunes");
                break;
            case 3:
                estadoDia = ("Martes");
                break;
            case 4:
                estadoDia = ("Miercoles");
                break;
            case 5:
                estadoDia = ("Jueves");
                break;
            case 6:
                estadoDia = ("Viernes");
                break;
            case 7:
                estadoDia = ("Sabado");
                break;
            default:
                estadoDia = "Opcion incorrecta";
                break;
        }
        return estadoDia;
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("%s",obtener_dia());
        return  cadena;
    }
}
