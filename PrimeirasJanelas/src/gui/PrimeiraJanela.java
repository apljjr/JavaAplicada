
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author Adeilson
 */
public class PrimeiraJanela {

    public static void main(String[] args) {
        Frame janela = new Frame();
        janela.setTitle("Primeira Janela");
        
        janela.setLayout(new BorderLayout());
        
        Button btCentro = new Button("Centro");
        Button btNorte = new Button("Norte");
        Button btSul = new Button("Sul");
        Button btLeste = new Button("Leste");
        Button btOeste = new Button("Oeste");
        
        btCentro.setBackground(Color.RED);
        btSul.setBackground(Color.BLUE);
        btNorte.setBackground(Color.GREEN);
        
        btCentro.setForeground(Color.WHITE);
        
        janela.add(btCentro, BorderLayout.CENTER);
        janela.add(btNorte, BorderLayout.NORTH);
        janela.add(btSul, BorderLayout.SOUTH);
        janela.add(btLeste, BorderLayout.EAST);
        janela.add(btOeste, BorderLayout.WEST);
        
        janela.setSize(640, 480);
        janela.setVisible(true);
    }
    
}
