public class coche extends vehiculo implements arrancable {
    /*clase coche extiende de vehiculo e implementa arrancable*/
    int ruedas = 4;
    String nombre = "COCHE";
    int velocidad;
    public MotorCoche motor;

    public coche(int cilindrada) {
        motor = new MotorCoche(cilindrada);
        velocidad = 0;

    }

    public void acelerar(double cantidad) {
        velocidad = 0;
    }

    public void encenderMotor() {
        System.out.println("Clindrada del Motor: "+this.motor.getCilindrada());
        System.out.println("Vehiculo arrancable");
    }

    ;

}
