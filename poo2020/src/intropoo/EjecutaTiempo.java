package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion
        Tiempo tiempo = new Tiempo();
        tiempo.aztualizar_hora(10);
        tiempo.aztualizar_minuto(52);
        tiempo.aztualizar_segundo(35);
        String mostrar_tiempo = tiempo.obtener_tiempo();
        System.out.println(mostrar_tiempo);
    }
}
