package unidad20.unidad20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class vista2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel resultado = new JLabel("Pulsa un botón");
	
	public vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		contentPane.add(resultado);
		
		JButton btn1 = new JButton("Boton 1");
		btn1.addActionListener(boton_action);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Boton 2");
		btn2.addActionListener(boton_action);
		contentPane.add(btn2);
	}
	
	
	
	ActionListener boton_action = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String numero = e.getActionCommand();
			resultado.setText("Has pulsado: "+numero);
		}
	};
	

}
