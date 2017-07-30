public class vehiculo {

  /** Función principal */
private int ruedas;
private String nombre;
private double velocidad=0;

public void acelerar(double cantidad) {
        velocidad= velocidad + cantidad;
}
public void frenar(double cantidad) {
        velocidad=velocidad - cantidad;
}

public double obtenerVelocidad(){
return  velocidad;  
 }


}