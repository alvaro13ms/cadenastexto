
package clasestring;


public class ClaseString {
    
    public static void main(String[] args) {
        
       String s = "iesmardealboran.com";
       //Tmaño de la cadena
        System.out.println("Tamaño: " +s.length());
       
        // Obtener el char de una posición concreta
        System.out.println("char asociado a la posición 5: " +s.charAt(5));
        
        // Obtener subcadena desde el caracter i-ésimo hasta el final de la cadena
       String subcadena= s.substring(3);
        System.out.println("Subcadena = " +subcadena);
        
          
        // Obtener subcadena desde el caracter i-ésimo hasta el caracter j-ésimo de la cadena
    subcadena= s.substring(8,15);
        System.out.println("Subcadena = " +subcadena);
        
     // Concatenar cadenas. Equivale al operador +
     String s1=  "ies";
     
    String s2= "mardealboran.com";
    String nuevo=s1+s2;
    String nuevo2=s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2: " +nuevo2);
    }
    
   
}
