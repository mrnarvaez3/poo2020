package intropoo;

public class Tiempo {

    // definicion de atributos globales
     private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){
        return hora;
    }
    /**
     * Metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto(){
        return minuto;
    }
    /**
     * Metodo para obtener el valor de la variable segundo
     * @return this.segundo
     */
    public int obtener_segundo(){
        return segundo;
    }
    /**
     * Metodo para obtener la cadena tiempo
     * @return tiempo
     */
    public String obtener_tiempo(){
        String tiempo = hora + ":" + minuto + ":" + segundo;
        return tiempo;
    }


    /**
     * Metodo para actualizar el valor de la variable hora
     */
    public void aztualizar_hora(int hora){
        //  Con el this hacemos referencia a variables globales
        this.hora = hora;
    }
    /**
     * Metodo para actualizar el valor de la variable minuto
     */
    public void aztualizar_minuto(int minuto){
        this.minuto = minuto;
    }
    /**
     * Metodo para actualizar el valor de la variable segundo
     */
    public void aztualizar_segundo(int segundo){
        this.segundo = segundo;
    }


}

