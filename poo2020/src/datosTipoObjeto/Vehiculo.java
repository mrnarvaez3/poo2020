package datosTipoObjeto;

public class Vehiculo {
        private String placa;
        private String marca;
        private int anio;
        private String color;
        private String modelo;
        private double cilindraje;

    public Vehiculo(String placa, String marca, int anio, String color, String modelo, double cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
}
