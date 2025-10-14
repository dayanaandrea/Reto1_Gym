package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Registro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public Registro() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(107, 82, 46, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(231, 79, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(107, 110, 46, 14);
		add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 107, 86, 20);
		add(textField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(107, 141, 46, 14);
		add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(231, 138, 86, 20);
		add(textField_2);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(107, 172, 77, 14);
		add(lblContrasea);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 169, 86, 20);
		add(textField_3);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(107, 197, 128, 14);
		add(lblFechaDeNacimiento);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(231, 194, 86, 20);
		add(textField_4);
		
		JButton btnRegistar = new JButton("Regístrate");
		btnRegistar.setBounds(147, 241, 133, 23);
		add(btnRegistar);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(107, 52, 46, 14);
		add(lblUsuario);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 49, 86, 20);
		add(textField_5);

	}

}
