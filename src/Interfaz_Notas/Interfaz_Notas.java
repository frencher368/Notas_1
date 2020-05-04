package Interfaz_Notas;

import java.awt.BorderLayout;
import javax.swing.*;
import Mundo_Notas.Notas;

public class Interfaz_Notas extends JFrame
{
	// ----------------------------------
    // Atributos
    // ----------------------------------
	
	private Notas Notas1;
	
	private Panel_Botones panel1;
	private Panel_Logo panel2;
	
	// ----------------------------------
    // Constructor
    // ----------------------------------
	
	public Interfaz_Notas ()
	{
		Notas1 = new Notas ( );
		
		setTitle( "Notas - Version 1.0" );
		setSize (380,400);
		setResizable (false);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		setLayout (new BorderLayout());
		
		panel2 = new Panel_Logo( );
		add (panel2, BorderLayout.NORTH);
		
		panel1 = new Panel_Botones(this);
		add (panel1, BorderLayout.CENTER);
	}
	
	// ----------------------------------
    // Metodos
    // ----------------------------------
	
	/**
	 * Agregar nota 1
	 */
	public void AsignarNota_1 ( )
	{
		String EscribirNota = JOptionPane.showInputDialog( this, "Escribe la nota: ", "Nota primer corte", JOptionPane.PLAIN_MESSAGE );
			
		if (EscribirNota == null)
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar un valor.", "Nota primer corte", JOptionPane.ERROR_MESSAGE );
		}
		else if (EscribirNota != null)
		{
			try
			{
				double Nota1 = Double.parseDouble(EscribirNota);
				
				if (Nota1 < 0)
				{
					JOptionPane.showMessageDialog( this, "Debe ingresar un valor mayor.", "Nota primer corte", JOptionPane.ERROR_MESSAGE );
				}
				else if (Nota1 > 5)
				{
					JOptionPane.showMessageDialog( this, "No existe una nota mayor a 5.0.", "Nota primer corte", JOptionPane.ERROR_MESSAGE );
				}
				else
				{
					Notas1.AsignarNota_1(Nota1);
					
					String Texto = String.valueOf(Nota1);
					this.panel1.txtNota1.setText(Texto);
				}		
			}
			catch( NumberFormatException e )
	           {
	               JOptionPane.showMessageDialog( this, "Debe ingresar un valor numerico.", "Nota primer corte", JOptionPane.ERROR_MESSAGE );
	           }
		}
	}
	
	/**
	 * Agregar nota 2
	 */
	public void AsignarNota_2 ( )
	{
		String EscribirNota = JOptionPane.showInputDialog( this, "Escribe la nota: ", "Nota segundo corte", JOptionPane.PLAIN_MESSAGE );
		
		if (EscribirNota == null)
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar un valor.", "Nota segundo corte", JOptionPane.ERROR_MESSAGE );
		}
		if (EscribirNota != null)
		{
			try
			{
				double Nota1 = Double.parseDouble(EscribirNota);
				
				if (Nota1 < 0)
				{
					JOptionPane.showMessageDialog( this, "Debe ingresar un valor mayor.", "Nota segundo corte", JOptionPane.ERROR_MESSAGE );
				}
				else if (Nota1 > 5)
				{
					JOptionPane.showMessageDialog( this, "No existe una nota mayor a 5.0.", "Nota segundo corte", JOptionPane.ERROR_MESSAGE );
				}
				else
				{
					Notas1.AsignarNota_2(Nota1);
					
					String Texto = String.valueOf(Nota1);
					this.panel1.txtNota2.setText(Texto);
				}		
			}
			catch( NumberFormatException e )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar un valor numerico.", "Nota segundo corte", JOptionPane.ERROR_MESSAGE );
            }
		}
	}
	
	/**
	 * Calcular nota 3
	 */
	public void AveriguarNota_3 ( )
	{
		double ASD = Notas1.AveriguarNota_3( );
		String Texto = String.valueOf(ASD);
		this.panel1.txtNota3.setText(Texto);
		
		String A = Notas1.Aviso();
		this.panel1.Mensaje.setText(A);
	}
	
	/**
	 * Limpia el programa
	 */
	public void Limpiar ( )
	{
		this.panel1.txtNota1.setText(" ");
		this.panel1.txtNota2.setText(" ");
		this.panel1.txtNota3.setText(" ");
		this.panel1.Mensaje.setText(" ");
		Notas1.Limpiar();
	}
	
	/**
	public int ObtenerNota1( )
	{
		String Texto = txtNota1.getText( );
		int Nota1 = Integer.parseInt( Texto );
		return Nota1;
	}
	*/
	
	/**
	 * Metodo Main
	 */
	public static void main ( String arg []) throws Exception
	{
		Interfaz_Notas p = new Interfaz_Notas();
		p.setVisible(true);
	}	
}
