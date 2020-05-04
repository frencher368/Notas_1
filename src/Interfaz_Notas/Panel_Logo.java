package Interfaz_Notas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel_Logo extends JPanel
{
	// -----------------------------------------------
    // Constructor del panel.
	public Panel_Logo ()
	{
		setLayout( new BorderLayout( ) );
        JLabel imagen = new JLabel( );
        ImageIcon icono = new ImageIcon( "data/imagenes/banner.jpg" );
        imagen = new JLabel( "" );
        imagen.setIcon( icono );
        add( imagen, BorderLayout.CENTER );

        setBackground( Color.WHITE );
        setBorder( new LineBorder( Color.BLACK ) );
	}
}
