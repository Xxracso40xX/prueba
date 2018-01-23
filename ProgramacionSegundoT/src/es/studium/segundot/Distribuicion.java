package es.studium.segundot;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;
public class Distribuicion extends Frame
{
	private static final long serialVersionUID = 1L;
	public Distribuicion()
	{
		setTitle("Ejemplo GridBagLayout");
		setLayout (new GridBagLayout());
		// Añadir componentes
		TextArea txtArea = new TextArea("Area texto");
		GridBagConstraints constraints = new GridBagConstraints();
		// El área de texto empieza en la columna cero
		constraints.gridx = 0;
		// El área de texto empieza en la fila cero
		constraints.gridy = 0;
		// El área de texto ocupa dos columnas
		constraints.gridwidth = 2;
		// El área de texto ocupa 2 filas
		constraints.gridheight = 2;
		//
		constraints.weighty = 1.0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		add (txtArea, constraints);

		Button btnBoton1 = new Button ("Boton 1");
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.fill = GridBagConstraints.NONE;
		add (btnBoton1, constraints);
		Button btnBoton2 = new Button ("Boton 2");
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		add (btnBoton2, constraints);
		Button btnBoton3 = new Button ("Boton 3");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.fill = GridBagConstraints.NONE;
		add (btnBoton3, constraints);
		Button btnBoton4 = new Button ("Boton 4");
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 0.0;
		constraints.weighty = 0.0;
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.SOUTH;
		add (btnBoton4, constraints);
		TextField txtCampo = new TextField ("Campo texto");
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weightx = 1.0;
		constraints.weighty = 0.0;
		constraints.anchor = GridBagConstraints.CENTER;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add (txtCampo, constraints);
		setLocationRelativeTo(null);
		
		//setLocationRelativeTo(null) sirve para centrar la ventana en el centro de la 
		//pantalla
		
		setSize(550,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Distribuicion();
	}
}