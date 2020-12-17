
package generadorclavesaleatorias;

import java.util.UUID;

/**
 *
 * @author ALEJO
 */
public class GeneradorClavesAleatorias {

    
    public static void main(String[] args) {
        
        //UUID (Unique Universal Identifier)
        
        //Generar claves largas
        System.out.println(UUID.randomUUID().toString().toUpperCase());
        
        //Generar claves cortas
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0, 4));
        
        
    }
    
}
