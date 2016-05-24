
package gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 *
 * @author Adeilson
 */
public class UsandoGridLayout {

    public static void main(String[] args) {
        Frame janela = new Frame();
        janela.setTitle("Titulo da Pagina");
        
        janela.setLayout(new GridLayout(3,2));
        
        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");
        Button bt5 = new Button("bt5");
        Button bt6 = new Button("bt6");
        
        
        janela.add(bt1);
        janela.add(bt2);
        janela.add(bt3);
        janela.add(bt4);
        janela.add(bt5);
        janela.add(bt6);
        
        janela.setSize(640, 480);
        janela.setVisible(true);
    }
    
}
