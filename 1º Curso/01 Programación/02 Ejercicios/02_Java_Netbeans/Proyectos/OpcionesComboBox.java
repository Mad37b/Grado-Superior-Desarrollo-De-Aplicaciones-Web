import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.beans.PropertyChangeEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JTextPane;

public class OpcionesComboBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelContenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionesComboBox frame = new OpcionesComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OpcionesComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PanelContenido = new JPanel();
		PanelContenido.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelContenido);
		PanelContenido.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() != 0) {
					verMensaje(comboBox.getSelectedItem().toString());
				}
			}
		});
		comboBox.setToolTipText("");
		comboBox.setBounds(28, 31, 203, 22);

		cargarOpciones(comboBox);

		PanelContenido.add(comboBox);
	}

	static void cargarOpciones(JComboBox primeros) {
		String ficheroPrimeros = new File ("").getAbsolutePath()+"\\src\\main\\java\\primeros.var";
		File fichero=new File(ficheroPrimeros);
		
		try {
			Scanner s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); // Guardamos la linea en un String
				primeros.addItem(linea);
			}

			s.close();
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		}
	}


	static void verMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
