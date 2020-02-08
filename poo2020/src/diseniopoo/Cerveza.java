package diseniopoo;

public class Cerveza {
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;

    //  constructor
    public Cerveza(double precio, int unidades_vendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // metodo para obtener total de ventas
    public double caclular_ventas(){
        double total = this.precio * this.unidades_vendidas;
        return total;
    }

    /**
     *  metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("Cerveza: %s\nTipo: %s\nPrecio: " +
                "%.2f\nUnidades Vendidas: %.2f", nombre, tipo, precio, caclular_ventas());
        return cadena;
    }
}
