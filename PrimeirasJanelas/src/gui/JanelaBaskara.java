
package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Adeilson
 */
public class JanelaBaskara extends Frame implements WindowListener, ActionListener{
    
    private Button btCalcular;
    private Button btLimpar;
    private TextField tfA;
    private TextField tfB;
    private TextField tfC;
    private Label lbA;
    private Label lbB;
    private Label lbC;
    private Label lbX1;
    private Label lbX2;
    private Label lbResultX1;
    private Label lbResultX2;
    
    
    
    public JanelaBaskara(){
        super("Fórmula de Baskara");
        this.setLayout(new FlowLayout());
        
        btCalcular = new Button("Calcular");
        btLimpar = new Button("Limpar");
        tfA = new TextField(10);
        tfB = new TextField(10);
        tfC = new TextField(10);
        lbA = new Label("A: ");
        lbB = new Label("B: ");
        lbC = new Label("C: ");
        lbX1 = new Label("X':");
        lbX2 = new Label("X'':");
        lbResultX1 = new Label("0.0");
        lbResultX2 = new Label("0.0");
        
        this.add(lbA);
        this.add(tfA);
        this.add(lbB);
        this.add(tfB);
        this.add(lbC);
        this.add(tfC);
        this.add(btCalcular);
        this.add(lbX1);
        this.add(lbResultX1);
        this.add(lbX2);
        this.add(lbResultX2);
        this.add(btLimpar);
        
        this.addWindowListener(this);
        btCalcular.addActionListener(this);
        
        //this.setSize(640,480);
        this.pack();
        this.setVisible(true);
        

    }
    
    public static void main(String[] args) {
        
        new JanelaBaskara();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
       System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
         System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivaded");
                
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setBackground(Color.RED);
    }
    
}
