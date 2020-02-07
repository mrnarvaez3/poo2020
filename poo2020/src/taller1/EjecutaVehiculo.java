package taller1;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_material("Fibra Carbono");
        vehiculo.actualizar_origen("Peru");
        vehiculo.actualizar_peso(900);
        vehiculo.actualizar_tipo("Vehiculo");
        vehiculo.actualizar_cilindraje("1.6");



        String mostrar_vehiculo = vehiculo.obtener_vehiculo();
        System.out.println(mostrar_vehiculo);
    }
}
