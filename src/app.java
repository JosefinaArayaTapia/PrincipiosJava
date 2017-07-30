


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

        /*Ejecicios*/


        String sPalabra = "anita lava la tina";
        int inc = 0;
        int des = sPalabra.length() - 1;
        boolean bError = false;

        while ((inc < des) && (!bError)) {

            if(sPalabra.charAt(inc)==sPalabra.charAt(des)){

                inc++;
                des--;

            }else {

                bError=true;
            }
        }

        String str1="hola";
        String str2=str1;
        str1.toUpperCase();
        str1=str1+"hola";
        System.out.println("String1:"+str1+" String2:"+str2);


        int i=0;
        int j=6;
        while (i<0) {
            i++;
            j++;
        }
        System.out.println(j);
    }




}
