
package util;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeilson Jr
 */
public class GravaTexto {

    public static void main(String[] args) {
        try {
            System.out.println("Abrindo para Gravação teste.txt");
            FileWriter fout = new FileWriter("teste.txt");
            PrintWriter pout = new PrintWriter(fout);
            
            pout.println("linha 01");
            pout.println("linha 02");
            pout.println("linha 03");
            pout.println("linha 04");
            
            System.out.println("Fechando teste.txt");
            
            pout.close();
            fout.close();
            
        } catch ( IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        
    }
    
}
