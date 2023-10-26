package unidad20.unidad20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vista7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblPulsePesetasA = new JLabel("Pesetas a euros");
	boolean modo_calcular = false;

	public vista7() {
		setTitle("Indice masa corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 11, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(192, 11, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setBounds(192, 30, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(315, 29, 89, 23);
		btnNewButton.addActionListener(funcion_numeros);
		contentPane.add(btnNewButton);
		
		lblPulsePesetasA.setBounds(10, 58, 293, 14);
		contentPane.add(lblPulsePesetasA);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(10, 83, 89, 23);
		btnCambiar.addActionListener(funcion_cambiar);
		contentPane.add(btnCambiar);
	}
	
	
	ActionListener funcion_numeros = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 try {
			        double cantidad = Double.parseDouble(textField.getText());
			        String simbolo ="";
			        if (modo_calcular) {
			        	cantidad = cantidad * 166.38;
			        	simbolo="ptas";
			        } else {
			        	cantidad = cantidad / 166.38;
			        	simbolo="€";
			        }
			        textField_1.setText(Math.round(cantidad*100.0)/100.0 +" "+simbolo);
			        
			    } catch (NumberFormatException f) {
			    	lblPulsePesetasA.setText("Pon valores validos");
			    	
			    }
		}
	};
	
	ActionListener funcion_cambiar = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String string = "";
			modo_calcular = !modo_calcular;
			if (!modo_calcular) {
				string = "Pesetas a euros";
			}else {
				string = "Euros a pesetas";
			}
			lblPulsePesetasA.setText(string);
		}
	};
	
	

	
	
	
	
}
