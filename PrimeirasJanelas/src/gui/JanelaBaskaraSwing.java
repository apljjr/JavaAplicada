
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Adeilson
 */
public class JanelaBaskaraSwing extends JFrame implements ActionListener{
    
    private JButton btCalcular;
    private JButton btLimpar;
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfC;
    private JLabel lbResultX1;
    private JLabel lbResultX2;
    
    private Container container;
    
    
    public JanelaBaskaraSwing(){
        super("Fórmula de Baskara");
        this.setLayout(new FlowLayout());
        
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        
        btCalcular = new JButton("Calcular");
        btLimpar = new JButton("Limpar");
        tfA = new JTextField(10);
        tfB = new JTextField(10);
        tfC = new JTextField(10);
        lbResultX1 = new JLabel("0.0");
        lbResultX2 = new JLabel("0.0");
        
        container.add(new JLabel("A: "));
        container.add(tfA);
        container.add(new JLabel("B: "));
        container.add(tfB);
        container.add(new JLabel("C: "));
        container.add(tfC);
        container.add(btCalcular);
        container.add(new JLabel("X':"));
        container.add(lbResultX1);
        container.add(new JLabel("X'':"));
        container.add(lbResultX2);
        container.add(btLimpar);
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        btCalcular.addActionListener(this);
        btLimpar.addActionListener(this);
        
        //this.setSize(640,480);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new JanelaBaskaraSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btCalcular){
            calcular();
        }else if (e.getSource() == btLimpar){
            limpar();
        }
    }

    private void calcular() {
        double a = Double.parseDouble(tfA.getText());
        double b = Double.parseDouble(tfB.getText());
        double c = Double.parseDouble(tfC.getText());
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        
        lbResultX1.setText(String.valueOf(x1));
        lbResultX2.setText(String.valueOf(x2));
    }

    private void limpar() {
        tfA.setText("");
        tfB.setText("");
        tfC.setText("");
        lbResultX1.setText("0.0");
        lbResultX2.setText("0.0");
    }

    
    
}
