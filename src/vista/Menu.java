package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Firebase to JSON");
		btnNewButton.setBounds(24, 46, 165, 23);
		add(btnNewButton);
		
		JButton btnJsonToFirebase = new JButton("JSON to Firebase");
		btnJsonToFirebase.setBounds(24, 80, 165, 23);
		add(btnJsonToFirebase);
		
		JButton btnBinaryToJson = new JButton("Binary to JSON");
		btnBinaryToJson.setBounds(24, 148, 165, 23);
		add(btnBinaryToJson);
		
		JButton btnJsonToBinary = new JButton("JSON to Binary");
		btnJsonToBinary.setBounds(24, 114, 165, 23);
		add(btnJsonToBinary);
		
		JButton btnWorkouts = new JButton("Workouts");
		btnWorkouts.setBounds(24, 182, 165, 23);
		add(btnWorkouts);
		
		JButton btnPantallaGestinUsuarios_1 = new JButton("Pantalla Gestión Usuarios");
		btnPantallaGestinUsuarios_1.setBounds(24, 216, 165, 23);
		add(btnPantallaGestinUsuarios_1);
		
		table = new JTable();
		table.setBounds(229, 46, 181, 193);
		add(table);

	}
}
