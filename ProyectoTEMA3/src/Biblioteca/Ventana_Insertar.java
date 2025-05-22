package Biblioteca;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Ventana_Insertar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_Editorial;
	private JTextField text_Anio;
	private JTextField text_Titulo;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana_Insertar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(61, 93, 99, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_Titulo = new JLabel("Nuevo Libro");
		lbl_Titulo.setBounds(141, 10, 131, 22);
		lbl_Titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lbl_Titulo);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(61, 138, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_Titulo = new JLabel("Titulo");
		lblNewLabel_Titulo.setBounds(49, 43, 99, 39);
		contentPane.add(lblNewLabel_Titulo);
		
		JTextField text_Id = new JTextField();
		text_Id.setBounds(276, 91, 96, 19);
		contentPane.add(text_Id);
		text_Id.setColumns(10);
		
		JTextField text_Autor = new JTextField();
		text_Autor.setBounds(276, 136, 96, 22);
		contentPane.add(text_Autor);
		text_Autor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Editorial");
		lblNewLabel_2.setBounds(61, 193, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Anio");
		lblNewLabel_3.setBounds(61, 218, 81, 48);
		contentPane.add(lblNewLabel_3);
		
		text_Editorial = new JTextField();
		text_Editorial.setBounds(276, 190, 96, 20);
		contentPane.add(text_Editorial);
		text_Editorial.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Disponible");
		lblNewLabel_4.setBounds(61, 264, 58, 22);
		contentPane.add(lblNewLabel_4);
		
		text_Anio = new JTextField();
		text_Anio.setBounds(276, 232, 96, 20);
		contentPane.add(text_Anio);
		text_Anio.setColumns(10);
		
		JCheckBox ch_Disponible = new JCheckBox("");
		ch_Disponible.setBounds(327, 264, 27, 39);
		contentPane.add(ch_Disponible);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionMySQL conexion = new ConexionMySQL("root", "", "biblioteca");
		        try {
					conexion.conectar();
					int valor=0;
					if (ch_Disponible.isSelected()) {
						valor=1;
					}
				
					String sentencia = "INSERT INTO libros(Id, Titulo ,Autor ,Editorial ,anio ,Disponible) VALUES ('"+text_Id.getText()+"','"+ text_Titulo.getText()+"','"+text_Autor.getText()+"','"+text_Editorial.getText()+"','"+text_Anio.getText()+"','"+ valor+"')";
				conexion.ejecutarInsertDeleteUpdate(sentencia);
					
					conexion.desconectar();
					
					dispose();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	

			
		btnNewButton.setBounds(141, 280, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		text_Titulo = new JTextField();
		text_Titulo.setBounds(276, 56, 96, 20);
		contentPane.add(text_Titulo);
		text_Titulo.setColumns(10);
		
		
	}
}
