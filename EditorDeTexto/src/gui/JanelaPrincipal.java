
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Adeilson Jr
 */
public class JanelaPrincipal extends JFrame{

    private JMenuBar barraMenu;
    private JMenu mnArquivo;
    private JMenuItem miNovo;
    private JMenuItem miAbrir;
    private JMenuItem miSalvar;
    private JMenuItem miSair;
    
    private JTextArea taTexto;
    
    
    
    
    public JanelaPrincipal(){
        super("Editor de Texto Java..");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        barraMenu = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        miNovo = new JMenuItem("Novo");
        miAbrir = new JMenuItem("Abrir");
        miSalvar = new JMenuItem("Salvar");
        miSair = new JMenuItem("Sair");
        taTexto = new JTextArea();
        
        mnArquivo.add(miNovo);
        mnArquivo.add(miAbrir);
        mnArquivo.add(miSalvar);
        mnArquivo.addSeparator();
        mnArquivo.add(miSair);
        
        barraMenu.add( mnArquivo );
        this.setJMenuBar(barraMenu);
        
        this.getContentPane().add( taTexto );
        
        miNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miNovoOnClick();
            }

        });
        
        miAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miAbrirOnClick();
            }
        });
        
        miSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miSalvarOnClick();
            }
        });
        
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miSairOnClick();
            }
        });
        
        this.setSize(640, 480);
        this.setVisible(true);
    }
    public static void main(String[] args) {
       new JanelaPrincipal();
    }
    
    private void miNovoOnClick() {
        taTexto.setText("");
    }
    private void miAbrirOnClick() {
        try {
            System.out.println("Abrindo para Gravação teste.txt");
            FileReader fin = new FileReader("teste.txt");
            BufferedReader pin = new BufferedReader(fin);
            
            
            String linha = pin.readLine();
            
            while( linha != null){
                taTexto.append(linha + "\n");
                linha = pin.readLine();
            }
                  
            pin.close();
            fin.close();
            
            JOptionPane.showMessageDialog(this, "Arquivo Salvo!!");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }
    private void miSalvarOnClick() {
        try {
            System.out.println("Abrindo para Gravação teste.txt");
            FileWriter fout = new FileWriter("teste.txt");
            PrintWriter pout = new PrintWriter(fout);
            
            pout.println(taTexto.getText());
            
                  
            pout.close();
            fout.close();
            
            JOptionPane.showMessageDialog(this, "Arquivo Salvo!!");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }
    private void miSairOnClick() {
        System.exit(0);
    }
    
}
