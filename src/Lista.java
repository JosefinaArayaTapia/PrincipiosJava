import java.util.ArrayList;

public class Lista {
 
      public static void main(String[] args) {
   ArrayList a=new ArrayList();
   a.add("Mauricio Contreras");
   a.add(25);
   a.add('D');
   a.add(3.1416);
   a.add(1024);
   System.out.println("Largo de la Cadena :" +a.size());
   System.out.println("Objeto de la Cadena 3 :" +a.get(3));
   a.remove(2);
   System.out.println("Largo de la Cadena :" +a.size());
   
    } 
}
