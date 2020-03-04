package polimorfismoFigura;

 class Circulo3 extends Figura3{
    double radioCir;

    public Circulo3(double radioCir, String nombre){
        this.radioCir = radioCir;
        this.nombre = nombre;
    }

     @Override
     public void calcularArea() {
         area = (3.1415) * Math.pow(radioCir,2);
     }
 }
