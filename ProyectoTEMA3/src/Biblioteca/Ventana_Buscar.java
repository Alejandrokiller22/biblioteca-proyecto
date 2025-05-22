package Biblioteca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana_Buscar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_id;

	
	public Ventana_Buscar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 707, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_id = new JTextField();
		textField_id.setBounds(252, 45, 96, 19);
		contentPane.add(textField_id);
		textField_id.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 145, 604, 117);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("LIBRO A BUSCAR");
		lblNewLabel.setBounds(99, 48, 143, 13);
		contentPane.add(lblNewLabel);
		
		JButton btn_Buscar = new JButton("Buscar");
		btn_Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TextoFinal="ID      TITULO";
				ConexionMySQL conexion = new ConexionMySQL("root", "", "biblioteca");
		        try {
					conexion.conectar();
					String sentencia = "SELECT * FROM libros WHERE Titulo = '" + textField_id.getText()+"'";
					ResultSet Elementos = conexion.ejecutarSelect(sentencia);
					
					
					
					while(Elementos.next())
					{
						String Id=Elementos.getString("Id");
						String Titulo=Elementos.getString("Titulo");
						String Autor=Elementos.getString("Autor");
						String Editorial=Elementos.getString("Editorial");
						int Anio=Elementos.getInt("Anio");
						boolean Disponible=Elementos.getBoolean("Disponible");
						TextoFinal=TextoFinal+
								   "\n"+Id+" "+Titulo+" "+Autor+" "+Editorial+" "+Anio+" "+Disponible;
					}
					
					textArea.setText(TextoFinal);
					conexion.desconectar();
					
					
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	
		
		
	

	
		btn_Buscar.setBounds(310, 296, 85, 21);
		contentPane.add(btn_Buscar);
		
		
	}
}
