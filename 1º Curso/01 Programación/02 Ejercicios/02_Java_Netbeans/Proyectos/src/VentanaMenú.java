import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaMenú extends JFrame {

	/**
	 * @author Profesor
	 * @version 1.0
	 * @title Menu Restaurante
	 */
	/** 1 Diseño **/
	/** 2 logica del programa **/
	/** 3 fichero Menú **/

	private static final long serialVersionUID = 1L;
	private JPanel PanelMenu;
	JLabel labelFondo = new JLabel();

	public static String Ruta = new String(
			"C:\\Users\\ULISES III\\Desktop\\Instituto FP DUAL SUPERIOR\\01 Programación\\Ejercicios Java\\Java_Menu\\");

	// Array del Menu del restaurante

	ImageIcon[] PrimeroMenu;
	ImageIcon[] SegundoMenu;
	ImageIcon[] PostreMenu;
	ImageIcon[] BebidasMenu;

	JComboBox<String> comboBoxPrimero = new JComboBox<>();
	JComboBox<String> comboBoxSegundo = new JComboBox<>();
	JComboBox<String> comboBoxPostres = new JComboBox<>();
	JComboBox<String> comboBoxBebidas = new JComboBox<>();

	JButton bottonMenu = new JButton("Generar Menú");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenú frame = new VentanaMenú();
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
	public VentanaMenú() {
		setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		setBackground(new Color(255, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 300);
		PanelMenu = new JPanel();
		PanelMenu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelMenu);
		PanelMenu.setLayout(null);

		// comboBoxPrimero.setModel(new DefaultComboBoxModel(new String[] {"-- Elige el
		// primer plato --", "1) Orella ", "2) Tripon", "3) Pulpo de carballiño", "4)
		// Callos", "5) Lacón con grelos", "6) Cachelos"}));
		comboBoxPrimero.setBounds(30, 50, 110, 22);
		PanelMenu.add(comboBoxPrimero);
		comboBoxPrimero.addActionListener(new ActionListener() {
			// @Override
			public void actionPerformed(ActionEvent e) {
				if (comboBoxPrimero.getSelectedIndex() != 0) {
					verMensaje(comboBoxPrimero.getSelectedItem().toString());
					
				}
			}
		});

		// comboBoxSegundo.setModel(new DefaultComboBoxModel(new String[] {"-- Elige el
		// segundo plato --", "1) Cocidos ", "2) Zorza con patatas", "3) Chourizos al
		// vino ", "4) Carne o Caldeiro"}));
		comboBoxSegundo.setBounds(155, 50, 110, 22);
		PanelMenu.add(comboBoxSegundo);

		/** JButton **/
		bottonMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				Fichero nuevoFichero= new Fichero();
				if (event.getSource() == bottonMenu) {
					
					String seleccionPrimero = (String) comboBoxPrimero.getSelectedItem();
		            String seleccionSegundo = (String) comboBoxSegundo.getSelectedItem();
		            String seleccionPostre = (String) comboBoxPostres.getSelectedItem();
		            String seleccionBebida = (String) comboBoxBebidas.getSelectedItem();
		            
		            Fichero.crearFichero(seleccionPrimero, seleccionSegundo, seleccionPostre, seleccionBebida);

					cargarOpciones(comboBoxPrimero, comboBoxSegundo, comboBoxPostres, comboBoxBebidas);
					

				}

			}

		});

		bottonMenu.setBounds(207, 227, 126, 23);
		PanelMenu.add(bottonMenu);

		// comboBoxPostres.setModel(new DefaultComboBoxModel(new String[] {"-- Elige el
		// Postre --", "1) Tarta de whisqui", "2) Tarta Helada con ron ", "3) Brazo de
		// gitano", "4) Cuña Sevillana"}));
		comboBoxPostres.setBounds(275, 50, 110, 22);
		PanelMenu.add(comboBoxPostres);

		// comboBoxBebidas.setModel(new DefaultComboBoxModel(new String[] {"-- Elige la
		// bebida--", "1) Licor de hierbas ", "2) Licor Café", "3) Agua Ardiente", "4)
		// Vino Via Romana", "5) Agua ", "6) Cerveza ", "7) Refrescos"}));
		comboBoxBebidas.setBounds(395, 50, 110, 22);
		PanelMenu.add(comboBoxBebidas);

		/** Jlabel **/

		JLabel labelTexto02 = new JLabel("Segundos");
		labelTexto02.setForeground(new Color(255, 255, 255));
		labelTexto02.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto02.setBounds(155, 15, 113, 20);
		PanelMenu.add(labelTexto02);

		JLabel labelTexto01 = new JLabel("Primeros");
		labelTexto01.setForeground(new Color(255, 255, 255));
		labelTexto01.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto01.setBounds(31, 15, 113, 20);
		PanelMenu.add(labelTexto01);

		JLabel labelTexto03 = new JLabel("Postres");
		labelTexto03.setForeground(new Color(255, 255, 255));
		labelTexto03.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto03.setBounds(275, 15, 113, 20);
		PanelMenu.add(labelTexto03);

		JLabel labelTexto04 = new JLabel("Bebidas\r\n");
		labelTexto04.setForeground(new Color(255, 255, 255));
		labelTexto04.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		labelTexto04.setBounds(395, 15, 113, 20);
		PanelMenu.add(labelTexto04);

		// public void actionPerformed(ActionEvent event) {

		// }

		/** Llamar a los metodos **/
		fondo();
		cargarOpciones(comboBoxPrimero, comboBoxSegundo, comboBoxPostres, comboBoxBebidas);
		
		

	}

	String rutaFondo = new String(Ruta + "FondoRestaurante.jpg");

	// metodo para Crear una imagen de fondo

	public void fondo() {
		ImageIcon ImagenFondo;

		ImagenFondo = new ImageIcon(rutaFondo);
		labelFondo.setIcon(ImagenFondo);
		// 1920 x 1080 Fondo de patalla original
		labelFondo.setSize(1000, 1000);
		PanelMenu.add(labelFondo);
		System.out.println("Testeo de la imagen " + ImagenFondo);

	}

	// Metodo para cargar las comandas al fichero
// VentanaMenú cargar =new VentanaMenú();
	public static void cargarOpciones(JComboBox<String> comboBoxPrimero, JComboBox <String> comboBoxSegundo, JComboBox <String> comboBoxPostres, JComboBox <String> comboBoxBebidas) {
		
	/** Creacion de los menus **/
		System.out.println("Iniciando carga de opciones..."+"\n");
		// Rutas 
		
		String rutaPrimeros = "C:\\Users\\ULISES III\\Desktop\\Instituto FP DUAL SUPERIOR\\01 Programación\\Ejercicios Java\\Java_Menu\\PrimerPlato\\primeros.vda";
		 System.out.println("Ruta de primeros platos: " + rutaPrimeros);
		String rutaSegundos = new File("").getAbsolutePath() + "\\SegundoPlato\\segundos.vda";
		System.out.println("Ruta de segundos platos: " + rutaSegundos);
		String rutaPostre = new File("").getAbsolutePath() + "\\Postre\\postre.vda";
		System.out.println("Ruta de postres: " + rutaPostre);
		String rutaBebidas = new File("").getAbsolutePath() + "\\Bebidas\\bebidas.vda";
		 System.out.println("Ruta de bebidas: " + rutaBebidas);
		//Ficheros
		
		File ficheroPrimeros=new File(rutaPrimeros);
		File ficheroSegundos=new File(rutaSegundos);
		File ficheroPostre=new File(rutaPostre);
		File ficheroBebidas=new File(rutaBebidas);
		
		System.out.println("\n");
		
		System.out.println("Testeo de fichero Primeros" + ficheroPrimeros);
		
		
		/** Imagenes **/
		
		//labelImagenPrimero= new label();

		try {
			Scanner scannerPrimero = new Scanner(ficheroPrimeros);
			Scanner scannerSegundo = new Scanner(ficheroSegundos);
			Scanner scannerPostre = new Scanner(ficheroPostre);
			Scanner scannerBebidas = new Scanner(ficheroBebidas);
			
			System.out.println("Leyendo archivos de opciones...");

			// Leemos linea a linea el fichero
			while (scannerPrimero.hasNextLine()) {
				String lineaPrimera = scannerPrimero.nextLine(); // Guardamos la linea en un String
				comboBoxPrimero.addItem(lineaPrimera);
				System.out.println("testeo primer plato = "+lineaPrimera);
				System.out.println("Testeo comboBox = "+comboBoxPrimero);
			
			}
			
			
			while (scannerSegundo.hasNextLine()) {
				String lineaSegundo = scannerSegundo.nextLine(); // Guardamos la linea en un String
				comboBoxSegundo.addItem(lineaSegundo);
				
			}
			
			while (scannerPostre.hasNextLine()) {
				String lineaPostre = scannerPostre.nextLine(); // Guardamos la linea en un String
				comboBoxPostres.addItem(lineaPostre);
				
			}
			
			while (scannerBebidas.hasNextLine()) {
				String lineaBebidas = scannerBebidas.nextLine(); // Guardamos la linea en un String
				comboBoxBebidas.addItem(lineaBebidas);
			
			}

			scannerPrimero.close();
			scannerSegundo.close();
			scannerPostre.close();
			scannerBebidas.close();
			
		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage() );
			System.out.println("\n");
			ex.printStackTrace();
		}
	}

	public static void verMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

}