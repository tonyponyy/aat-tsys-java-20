package unidad20.unidad20;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea; 
import javax.swing.JScrollPane; 

public class vista4 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;
    

    public vista4() {
    	contentPane = new JPanel();
        textArea = new JTextArea();
        textArea.setLineWrap(true); 
        textArea.setWrapStyleWord(true); 
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 36, 396, 199);
        contentPane.add(scrollPane);
        agregar_texto("se ha añadido el textarea");
        setTitle("titulo");
        agregar_texto("se ha añadido el titulo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel("Eventos");
        lblNewLabel.setBounds(10, 11, 39, 14);
        contentPane.add(lblNewLabel);
        agregar_texto("se ha añadido la label");
        
      
        addWindowListener(new WindowAdapter() {
            public void windowIconified(WindowEvent e) {
                agregar_texto("se ha minimizado");
            }

            public void windowStateChanged(WindowEvent e) {
                if ((e.getNewState() & JFrame.ICONIFIED) == JFrame.ICONIFIED) {
                    agregar_texto("se ha minimizado");
                } else {
                    agregar_texto("se ha restaurado la ventana");
                }
            }
        });

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                agregar_texto("se ha cambiado de tamaño");
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                agregar_texto("se ha movido la ventana");
            }
        });
    }

    private void agregar_texto(String texto) {
        String temp = textArea.getText();
        textArea.setText(temp + texto+ "\n" );
    }
}

