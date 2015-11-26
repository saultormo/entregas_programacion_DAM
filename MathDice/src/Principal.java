import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	//Las variables
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldAge;
	private JTextField textFieldCheck;

	//Entrada al juego
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Constructor
	public Principal() {
		
		//Propiedades de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Label Datos
		JLabel labelDatos = new JLabel("DATOS DEL JUGADOR");
		labelDatos.setHorizontalAlignment(SwingConstants.CENTER);
		labelDatos.setBounds(112, 11, 154, 14);
		contentPane.add(labelDatos);
		
		//Label Nombre
		JLabel labelName = new JLabel("Nombre");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(10, 45, 56, 14);
		contentPane.add(labelName);
		
		//Label Apellido
		JLabel labelSurname = new JLabel("Apellido");
		labelSurname.setHorizontalAlignment(SwingConstants.CENTER);
		labelSurname.setBounds(10, 87, 56, 14);
		contentPane.add(labelSurname);
		
		//Label Edad
		JLabel labelAge = new JLabel("Edad");
		labelAge.setHorizontalAlignment(SwingConstants.CENTER);
		labelAge.setBounds(10, 128, 56, 14);
		contentPane.add(labelAge);
		
		//Botón Comprobar
		JButton btnCheck = new JButton("\u00A1A JUGAR!");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoName=textFieldName.getText();
				String textoSurname=textFieldSurname.getText();
				String textoAge=textFieldAge.getText();
				if (textoName.length()==0){
					textFieldCheck.setText("Faltan campos por rellenar");		
				}else if (textoSurname.length()==0){
					textFieldCheck.setText("Faltan campos por rellenar");	
				}else if (textoAge.length()==0){
					textFieldCheck.setText("Faltan campos por rellenar");	
				}else{
					textFieldCheck.setText("Player "+textFieldName.getText()+" "+textFieldSurname.getText()+" de edad "+textFieldAge.getText()+" ha sido generado.");
				}
			}
		});
		btnCheck.setBounds(10, 167, 364, 23);
		contentPane.add(btnCheck);
		
		//Field Nombre
		textFieldName = new JTextField();
		textFieldName.setBounds(76, 42, 298, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		//Field Apellido
		textFieldSurname = new JTextField();
		textFieldSurname.setBounds(76, 84, 298, 20);
		contentPane.add(textFieldSurname);
		textFieldSurname.setColumns(10);
		
		//Field Edad
		textFieldAge = new JTextField();
		textFieldAge.setBounds(76, 125, 111, 20);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		//Field Comprobar
		textFieldCheck = new JTextField();
		textFieldCheck.setBounds(10, 201, 364, 49);
		contentPane.add(textFieldCheck);
		textFieldCheck.setColumns(10);
		
		/*Código Ejercicio 1
		Jugador player=new Jugador();
		player.name="Saul";
		player.surname="Tormo";
		player.age=18;
		player.points=10;
		System.out.println("El jugador "+player.name+" "+player.surname+" tiene "+player.age+" años y "+player.points+" puntos.");
		*/
	}

}
