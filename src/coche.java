public class coche extends vehiculo implements arrancable{
    int ruedas=4;
    String nombre="COCHE";
    int velocidad;
    public MotorCoche motor;
    
    public coche(int cil) {
         motor =new MotorCoche(cil);
         velocidad=0;
}
    public void acelerar(double cantidad) {
        velocidad= 0;
}
    public void encenderMotor(){
    System.out.println(" Vehiculo arrancable ");
    };
    
}
