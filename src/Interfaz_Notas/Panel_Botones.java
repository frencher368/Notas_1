package Interfaz_Notas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Panel_Botones extends JPanel implements ActionListener
{
	// ----------------------------------
    // Constantes
    // ----------------------------------
	
	private static final String CALCULAR = "Calcular";
	private static final String NOTA1 = "Nota 1";
	private static final String NOTA2 = "Nota 2";
	private static final String LIMPIAR = "Limpiar";
	
	// ----------------------------------
    // Atributos
    // ----------------------------------
	
	private Interfaz_Notas ventanaPrincipal;
	
	private JButton Aceptar;
	private JButton Nota1;
	private JButton Nota2;
	private JButton Limpiar;
	
	private JLabel Creator;
	private JLabel Titulo;
	private JLabel LBNota1;
	private JLabel LBNota2;
	private JLabel LBNota3;
	public JLabel Mensaje;
	public JLabel Aviso;
	public JLabel Imagen;
	
	public JTextField txtNota1;
	public JTextField txtNota2;
	public JTextField txtNota3;
	
	// ----------------------------------
    // Constructor
    // ----------------------------------
	
	public Panel_Botones (Interfaz_Notas ids)
	{
		//setBounds(30, 90, 70, 30);
		ventanaPrincipal = ids;
		
		setLayout(null);
		setPreferredSize(new Dimension(300,300));
		TitledBorder border = BorderFactory.createTitledBorder("Notas del Curso");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		//setBackground(Color.LIGHT_GRAY);
				
		Titulo = new JLabel("¿Cuanto saco para aprobar?");
		Titulo.setBounds(92, 15, 200, 30);
		Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
		add (Titulo);
		
		LBNota1 = new JLabel("Nota 1 - 30%");
		LBNota1.setBounds(30, 50, 100, 30);
		LBNota1.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
		add (LBNota1);
		
		txtNota1 = new JTextField (" ");
		txtNota1.setEditable(false);
		txtNota1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota1.setBounds(30, 85, 70, 30);
		add (txtNota1);
		
		Nota1 = new JButton ("Add Nota");
		Nota1.setActionCommand(NOTA1);
		Nota1.addActionListener( this );
		Nota1.setBounds(23, 125, 85, 30);
		add (Nota1);
		
		LBNota2 = new JLabel("Nota 2 - 30%");
		LBNota2.setBounds(148, 50, 100, 30);
		LBNota2.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
		add (LBNota2);
		
		txtNota2 = new JTextField (" ");
		txtNota2.setEditable(false);
		txtNota2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota2.setBounds(150, 85, 70, 30);
		add (txtNota2);
		
		Nota2 = new JButton ("Add Nota");
		Nota2.setActionCommand(NOTA2);
		Nota2.addActionListener( this );
		Nota2.setBounds(143, 125, 85, 30);
		add (Nota2);
		
		LBNota3 = new JLabel("Nota 3 - 40%");
		LBNota3.setBounds(266, 50, 100, 30);
		LBNota3.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
		add (LBNota3);
		
		txtNota3 = new JTextField (" ");
		txtNota3.setEditable(false);
		txtNota3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota3.setBounds(268, 85, 70, 30);
		add (txtNota3);
		
		Aceptar = new JButton ("Calcular");
		Aceptar.setActionCommand(CALCULAR);
		Aceptar.addActionListener( this );
		Aceptar.setBounds(261, 125, 85, 30);
		add (Aceptar);
		
		Aviso = new JLabel("Aviso: ");
		Aviso.setBounds(15, 175, 300, 30);
		Aviso.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
		add (Aviso);
		
		/**
		String path = "data/imagenes/imagen1.jpg";
		ImageIcon icon = new ImageIcon(path);
		Imagen = new JLabel(icon);
		Imagen.setIcon(icon);
		Imagen.setBounds(200, 183, 80, 70);
		add (Imagen);
		*/
		
		Mensaje = new JLabel("");
		Mensaje.setBounds(55, 175, 300, 30);
		Mensaje.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
		add (Mensaje);
		
		Limpiar = new JButton ("Limpiar");
		Limpiar.setActionCommand(LIMPIAR);
		Limpiar.addActionListener( this );
		Limpiar.setBounds(14, 225, 85, 30);
		add (Limpiar);
		
		Creator = new JLabel("By: A.E.");
		Creator.setFont(new java.awt.Font("Freestyle Script", 0, 16));
		Creator.setBounds(325, 235, 85, 30);
		add (Creator);
	}
	
	// ----------------------------------
    // Metodos
    // ----------------------------------
	
	/**
	 * Evento
	 */
	public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( comando.equals( CALCULAR ) )
        {
        	ventanaPrincipal.AveriguarNota_3( );
        }
        else if( comando.equals( NOTA1 ) )
        {
        	ventanaPrincipal.AsignarNota_1( );
        }
        else if( comando.equals( NOTA2 ) )
        {
        	ventanaPrincipal.AsignarNota_2( );
        }
        else if( comando.equals( LIMPIAR ) )
        {
        	ventanaPrincipal.Limpiar( );
        }
    }
}
