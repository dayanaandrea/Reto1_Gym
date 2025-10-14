package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtUserLogin;
	private JTextField txtPasswordLogin;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		txtUserLogin = new JTextField();
		txtUserLogin.setBounds(198, 90, 86, 20);
		add(txtUserLogin);
		txtUserLogin.setColumns(10);
		
		JLabel lblUserLogin = new JLabel("Usuario");
		lblUserLogin.setBounds(120, 93, 46, 14);
		add(lblUserLogin);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(120, 129, 68, 14);
		add(lblContrasea);
		
		txtPasswordLogin = new JTextField();
		txtPasswordLogin.setColumns(10);
		txtPasswordLogin.setBounds(198, 126, 86, 20);
		add(txtPasswordLogin);
		
		JLabel lblRegistrarseLogin = new JLabel("¡ Registrate !");
		lblRegistrarseLogin.setBounds(210, 237, 67, 14);
		add(lblRegistrarseLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(198, 181, 89, 23);
		add(btnEntrar);

	}
}
