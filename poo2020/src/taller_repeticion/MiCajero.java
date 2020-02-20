package taller_repeticion;

/**
 * . Realizar un programa para simular un cajero automático, el programa debe mostrar al
 * usuario un menú de opciones que se repetirán si es que el usuario así lo desea.
 * El programa debe preguntar el nombre del socio, el saldo inicial de su cuenta.
 * Se tiene que permitir realizar depósitos, retiros y consulta de saldos.
 */
public class MiCajero {
    private String nombre;
    public  double sueldoInicial;

    public MiCajero(String nombre, double sueldoInicial){
        this.nombre = nombre;
        this.sueldoInicial = sueldoInicial;
    }

    public double depositar(double deposito){

        sueldoInicial = sueldoInicial + deposito;
        return sueldoInicial;
    }
    public double retirar(double retiro){
        sueldoInicial = sueldoInicial - retiro;
        return sueldoInicial;
    }
    public String consultar(){
        String cadena  = "Su saldo"+nombre +" es de: " + sueldoInicial;
        return cadena;
    }

    public  double getSueldoInicial() {
        return sueldoInicial;
    }
}
