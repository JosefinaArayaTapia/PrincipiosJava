


public class app {

    public static void main(String[] args) {
        vehiculo bmw = new vehiculo();
        bmw.acelerar(23);
        bmw.frenar(3);
        System.out.println("Velocidad : " + bmw.obtenerVelocidad());

        moto yamaha = new moto();
        System.out.println("Nombre : " + yamaha.obtenerNombre());
        System.out.println("Nombre : " + yamaha.nombre);

        coche c1 = new coche(1);
        c1.encenderMotor();

    }
}
