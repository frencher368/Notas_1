package Mundo_Notas;

import javax.swing.*;

public class Notas
{
	// ----------------------------------
    // Atributos
    // ----------------------------------
	
	/**
	 * Porcentajes de los cortes
	 */
	private final static double Porcentaje_PrimerCorte = 0.3;
	private final static double Porcentaje_SegundoCorte = 0.3;
	private final static double Porcentaje_TercerCorte = 0.4;
	private final static int Nota_Para_Aprovar = 3;
	
	/**
	 * Notas de los cortes
	 */
	private double Nota_PrimerCorte;
	private double Nota_SegundoCorte;
	
	// ----------------------------------
    // Constructor
    // ----------------------------------
	
	/**
	 * Constructor de la clase notas
	 */
	public Notas ()
	{
		Nota_PrimerCorte = 0;
		Nota_SegundoCorte = 0;
	}
	
	// ----------------------------------
    // Metodos
    // ----------------------------------
		
	/**
	 * Asigna la nota 1 por medio de un showInputDialog
	 */
	public void AsignarNota_1 ( double LaNota )
	{
		Nota_PrimerCorte = LaNota;
	}
	
	/**
	 * Asigna la nota 2 por medio de un showInputDialog
	 */
	public void AsignarNota_2 ( double LaNota )
	{
		Nota_SegundoCorte = LaNota;
	}
	
	/**
	 * Se averigua la nota que se tiene que sacar para el tercer corte
	 */
	public double AveriguarNota_3 ( )
	{
		double Resultado = 0;
		
		if ( Nota_PrimerCorte == 0 && Nota_SegundoCorte == 0)
		{
			JOptionPane.showMessageDialog(null, "Primero Ingrese las dos notas");
		}
		else
		{
			int Numero100 = 100;
			double Suma = Nota_PrimerCorte * Porcentaje_PrimerCorte + Nota_SegundoCorte * Porcentaje_SegundoCorte;
			double Operacion = Nota_Para_Aprovar - Suma;
			double Res = Operacion / Porcentaje_TercerCorte;
			
			int A = (int)(Res * 1);
			double B = (Res - A);
			double C = (B * Numero100);
			double D = Math.round(C);
			double E = (A + D / Numero100);
			
			if ( E > 5 )
			{
				Resultado = 5.0;
			}
			else
				Resultado = E;
		}
		
		
		return Resultado;
	}
	
	/**
	 * Limpiar
	 */
	public void Limpiar ( )
	{
		Nota_PrimerCorte = 0;
		Nota_SegundoCorte = 0;
	}
	
	/**
	 * Aviso
	 */
	public String Aviso( )
	{
		String Texto;
		
		if (AveriguarNota_3() <= 1)
		{
			Texto = "Ya no vaya a clase.";
		}
		else if (AveriguarNota_3() > 1 && AveriguarNota_3() <= 2)
		{
			Texto = "Ya ganaste.";
		}
		else if (AveriguarNota_3() > 2 && AveriguarNota_3() <= 3)
		{
			Texto = "Ganaste pero ten cuidado.";
		}
		else if (AveriguarNota_3() > 3 && AveriguarNota_3() <= 3.5)
		{
			Texto = "Ganaste el parcial como sea...";
		}
		else if (AveriguarNota_3() > 3.5 && AveriguarNota_3() <= 4)
		{
			Texto = "Dificil pero se puede...";
		}
		else if (AveriguarNota_3() > 4 && AveriguarNota_3() <= 4.5)
		{
			Texto = "Valiste verga...";
		}
		else
			Texto = "Vaya venda cholados";
			
		return Texto;
	}
}
