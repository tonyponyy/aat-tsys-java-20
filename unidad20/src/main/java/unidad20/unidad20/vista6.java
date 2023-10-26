package unidad20.unidad20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vista6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel label = new JLabel("Pulse calcular para saber su IMC");


	public vista6() {
		setTitle("Indice masa corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso (kg)");
		lblNewLabel.setBounds(10, 11, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura (m)");
		lblNewLabel_1.setBounds(116, 11, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 30, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(222, 29, 89, 23);
		btnNewButton.addActionListener(funcion_numeros);
		contentPane.add(btnNewButton);
		
		label.setBounds(10, 61, 293, 14);
		contentPane.add(label);
	}
	
	
	ActionListener funcion_numeros = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			 try {
			        double peso = Double.parseDouble(textField.getText());
			        double altura = Double.parseDouble(textField_1.getText());
			        if (altura > 0) {
			        	//  IMC= Peso actual (kg) ÷ altura (m) x altura (m)
			            double imc = peso/(altura*altura);
			            String resultado = "tu IMC es: "+ imc;
			            label.setText(resultado); 
			        } else {
			            label.setText("La altura tiene que ser mayor que 0");
			        }
			    } catch (NumberFormatException f) {
			        label.setText("Pon valores validos");
			    }
		}
	};
	
	
	

	
	
	
	
}
