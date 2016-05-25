
package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class JanelaBaskaraSwing extends JFrame implements ActionListener{
    
    private JButton btCalcular;
    private JButton btLimpar;
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfC;
    private JLabel lbResultX1;
    private JLabel lbResultX2;
    private JMenuBar barraMenu;
    private JMenu mnArquivo;
    private JMenu mnAjuda;
    private JMenuItem miNovo;
    private JMenuItem miSair;
    private JMenuItem miSobre;
    
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
        barraMenu = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnAjuda = new JMenu("Ajuda");
        miNovo = new JMenuItem("Novo");
        miSair = new JMenuItem("Sair");
        miSobre = new JMenuItem("Sobre...");
        
        barraMenu.add(mnArquivo);
        barraMenu.add(mnAjuda);
        
        mnArquivo.add(miNovo);
        mnArquivo.add(miSair);
        mnAjuda.add(miSobre);
        
        this.setJMenuBar(barraMenu);
        
        
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
        miNovo.addActionListener(this);
        miSair.addActionListener(this);
        miSobre.addActionListener(this);
        
        //this.setSize(640,480);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new JanelaBaskaraSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btCalcular){
            calcular();
        }else if (e.getSource() == btLimpar || e.getSource() == miNovo){
            limpar();
        }else if (e.getSource() == miSair){
            System.exit(0);
        }else if(e.getSource() == miSobre){
            //JOptionPane.showMessageDialog(this, "Programa desenvolvido por Adeilson Jr");
            new JanelaSobre(this);
        }
    }

    private void calcular() {
        
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
    
    public JTextField getTfA(){
        return tfA;
    }
    
    public JTextField getTfB(){
        return tfB;
    }
    
    public JTextField getTfC(){
        return tfC;
    }
    
    public JLabel getLbResultX1(){
        return lbResultX1;
    }
    
    public JLabel getLbResultX2(){
        return lbResultX2;
    }
   
}
