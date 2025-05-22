package Biblioteca;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Titulo = new JLabel("BIBLIOTECA");
		lbl_Titulo.setBounds(219, 184, 171, 24);
		lbl_Titulo.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lbl_Titulo);
		
		JButton btn_Insertar = new JButton("Insertar libro");
		btn_Insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Ventana_Insertar t2=new Ventana_Insertar();
				t2.setVisible(true);
				
			}
		});
		btn_Insertar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Insertar.setBounds(234, 271, 187, 21);
		contentPane.add(btn_Insertar);
		
		JButton btn_Buscar = new JButton("Buscar libro");
		btn_Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Ventana_Buscar t1=new Ventana_Buscar();
				t1.setVisible(true);
			}
		});
		btn_Buscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Buscar.setBounds(234, 302, 187, 21);
		contentPane.add(btn_Buscar);
		
		
	}
}
