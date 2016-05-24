
package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Adeilson
 */
public class UsandoFlowLayout {

    public static void main(String[] args) {
        Frame janela = new Frame();
        janela.setTitle("Titulo da Pagina");
        
        janela.setLayout(new FlowLayout());
        
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        
        
        janela.add(bt1);
        janela.add(bt2);
        janela.add(bt3);
        janela.add(bt4);
        janela.add(bt5);
        
        janela.setSize(640, 480);
        janela.setVisible(true);
    }
    
}
