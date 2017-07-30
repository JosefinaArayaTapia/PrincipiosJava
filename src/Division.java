public class Division {
    
    public static void main(String[] args) {

        int numerador=12;
        int denomimador=0;
        try{
            int k=numerador/denomimador;
            System.out.println("Esto no se va a Ejecutar.");
            
           } catch( ArithmeticException e ) {
             System.out.println( "Se ha producido un Error Aritmetico " );
             }
             catch( Exception e ) {
             System.out.println( "Se ha producido un Error " );
             }
        finally{
            System.out.println("Fin del programa");
               }
   }
}
