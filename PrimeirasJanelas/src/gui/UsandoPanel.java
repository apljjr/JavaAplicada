
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author Adeilson
 */
public class UsandoPanel {

    public static void main(String[] args) {
        Frame janela = new Frame();
        janela.setTitle("Primeira Janela");
        
        janela.setLayout(new BorderLayout());
        
        Button btCentro = new Button("Centro");
        Button btNorte1 = new Button("Norte1");
        Button btNorte2 = new Button("Norte2");
        Button btSul = new Button("Sul");
        Button btLeste = new Button("Leste");
        Button btOeste = new Button("Oeste");
        
        Panel pNorte = new Panel();
        pNorte.add(btNorte1);
        pNorte.add(btNorte2);
        
        
        janela.add(btCentro, BorderLayout.CENTER);
        janela.add(pNorte, BorderLayout.NORTH);
        janela.add(btSul, BorderLayout.SOUTH);
        janela.add(btLeste, BorderLayout.EAST);
        janela.add(btOeste, BorderLayout.WEST);
        
        janela.setSize(640, 480);
        janela.setVisible(true);
    }
    
}
