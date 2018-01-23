package es.studium.segundot;

import java.awt.FlowLayout;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class gentilicios extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	//Creación de una lista con 4 elementos visibles y que no
	//permite multiselección
	List lista = new List ( 4, false );
	Label etiqueta = new Label("                                    ");
	public gentilicios()
	{
		setLayout(new FlowLayout());
		setTitle("Lista de provincias");
		lista.add("Sevilla");
		lista.add("Córdoba");
		lista.add("Huelva");
		lista.add("Jaén");
		lista.add("Málaga");
		lista.add("Almeriense");
		add(lista);
		add(etiqueta);
		addWindowListener(this);
		//Para implementar el doble clic del ratón
		//Si sólo quisiéramos una pulsación, lista.addItemListener
		lista.addActionListener(this);
		setSize(600, 200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new gentilicios();
	}
	public void actionPerformed(ActionEvent ae)
	{
		String nombreComunidad = lista.getSelectedItem();

		if (nombreComunidad == "Sevilla"){
			etiqueta.setText("Sevillano");
		}
		else if (nombreComunidad == "Córdoba") {
			etiqueta.setText("Cordobés");
		}

		else if (nombreComunidad == "Almería") {
			etiqueta.setText("Almeriense");
		}
		else if (nombreComunidad == "Cádiz") {
			etiqueta.setText("Gaditano");

		}else if (nombreComunidad == "Huelva") {
			etiqueta.setText("Onubense");

		}else if (nombreComunidad == "Jaén") {
			etiqueta.setText("Jienense");
		}
		else if (nombreComunidad == "Málaga") {
			etiqueta.setText("Malagueño");
		}
	}


	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}