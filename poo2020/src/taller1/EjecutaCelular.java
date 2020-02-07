package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {
        // Creacion de objeto tiempo
        //  encapsulacion del objeto
        Celular celular = new Celular();
        celular.actualizar_marca("Asus");
        celular.actualizar_bateria("Bateria de Litio");
        celular.actualizar_material("Plastico");
        celular.actualizar_procesador("SnapDragon");
        celular.actualizar_ram(6);



        String mostrar_celular = celular.obtener_celular();
        System.out.println(mostrar_celular);
    }
}
