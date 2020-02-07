package diseniopoo;

public class Cerveza {
    private double precio;
    private int unidades_vendidas;
    private String nombre;
    private String tipo;


    public Cerveza(double precio, int unidades_vendidas, String nombre, String tipo){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double caclular_ventas(){
        double total = this.precio * this.unidades_vendidas;
        return total;
    }

    /**
     *  metodo para calcular unidades vendidas
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("Cerveza: %s\nTipo: %s\nPrecio: " +
                "%.2f\nUnidades Vendidas: %.2f", nombre, tipo, precio, caclular_ventas());
        return cadena;
    }
}
