
package applet;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Adeilson
 */
public class MeuApplet extends JApplet /*implements ActionListener*/{
    
    private JButton btCalcular;
    private JButton btLimpar;
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfC;
    private JLabel lbResultX1;
    private JLabel lbResultX2;  
    private Container container;
    
    
    public MeuApplet(){

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
        
        
        btCalcular.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                btCalcularAction();
            }
        });
        btLimpar.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                btLimparAction();
            }
        });
        
        
        //this.setSize(640,480);
       
       
    }
    
 
    private void btCalcularAction() {
        
        if(isCamposConsistentes()){
            
            //Entrada
        double a = Double.parseDouble(tfA.getText());
        double b = Double.parseDouble(tfB.getText());
        double c = Double.parseDouble(tfC.getText());
        
        //Processamento
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        //Saída
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        
        lbResultX1.setText(String.valueOf(x1));
        lbResultX2.setText(String.valueOf(x2));
            
        }else{
            JOptionPane.showMessageDialog(this, "Campos inconsistentes");
        }
        
        
    }
    
    private void btLimparAction(){
        limpar();
    }
    
    
    private void limpar() {
        tfA.setText("");
        tfB.setText("");
        tfC.setText("");
        lbResultX1.setText("0.0");
        lbResultX2.setText("0.0");
    }

    private boolean isCamposConsistentes() {
        String a = tfA.getText().trim();
        String b = tfB.getText().trim();
        String c = tfC.getText().trim();
        
        if(a.equals("")){
            tfA.requestFocus();
            return false;
        }else if (b.equals("")){
            tfB.requestFocus();
            return false;
        }else if (c.equals("")){
            tfC.requestFocus();
            return false;
        }
        
        try {
            Double.parseDouble(a);
        } catch (Exception e) {
            tfA.requestFocus();
            return false;
        }
        
        try {
            Double.parseDouble(b);
        } catch (Exception e) {
            tfB.requestFocus();
            return false;
        }
        
        try {
            Double.parseDouble(c);
        } catch (Exception e) {
            tfC.requestFocus();
            return false;
        }
        
        return true;
    }
    
    
   
}
