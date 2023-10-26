package unidad20.unidad20;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea; 
import javax.swing.JScrollPane; 

public class vista5 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;
    

    public vista5() {
    	contentPane = new JPanel();
        textArea = new JTextArea();
        textArea.setLineWrap(true); 
        textArea.setWrapStyleWord(true); 
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 36, 396, 199);
        contentPane.add(scrollPane);
        setTitle("titulo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel("Eventos raton");
        lblNewLabel.setBounds(10, 11, 39, 14);
        contentPane.add(lblNewLabel);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregar_texto("click en x: "+e.getX()+" click en Y: " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                agregar_texto("raton dentro de la ventana");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                agregar_texto("raton fuera de la ventana");
            }
        });
      
    }

    private void agregar_texto(String texto) {
        String temp = textArea.getText();
        textArea.setText(temp + texto+ "\n" );
    }
}

