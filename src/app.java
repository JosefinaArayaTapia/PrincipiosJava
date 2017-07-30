


public class app {

    public static void main(String[] args) {
        vehiculo bmw = new vehiculo();
        bmw.acelerar(23);
        bmw.frenar(3);
        System.out.println("Velocidad : " + bmw.obtenerVelocidad());

        moto yamaha = new moto();
        yamaha.acelerar(23);
        yamaha.acelerar(23);
        yamaha.frenar(23);
        System.out.println("Nombre : " + yamaha.obtenerNombre());
        System.out.println("Nombre : " + yamaha.obtenerVelocidad());

        coche c1 = new coche(40);
        c1.encenderMotor();


    }
}
