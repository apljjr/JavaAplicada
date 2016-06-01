
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeilson Jr
 */
public class LerArqTexto {

    public static void main(String[] args) {
        try {
            System.out.println("Abrindo teste.txt");
            FileReader fin = new FileReader("teste.txt");
            BufferedReader bin = new BufferedReader(fin);
            
            
            System.out.println("Lendo teste.txt");
            
            String linha = bin.readLine();
            
            while(linha != null){
                System.out.println(linha);
                linha = bin.readLine();
            }
            
            
            System.out.println("Fechando teste.txt");
            
            bin.close();
            fin.close();
            
        } catch ( FileNotFoundException e){
            System.out.println("Erro: Arquivo não existe");
        } catch ( IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        
    }
    
}
