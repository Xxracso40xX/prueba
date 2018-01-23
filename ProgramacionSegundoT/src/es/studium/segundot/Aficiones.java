package es.studium.segundot;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Aficiones extends Frame implements WindowListener, ActionListener
{
	//ODIO LOS COMMIT.
	
	Checkbox chkUno = new Checkbox("Deporte", false);
	Checkbox chkDos = new Checkbox("Lectura", false);
	Checkbox chkTres = new Checkbox("Cine", false);
	Checkbox chkCuatro = new Checkbox("Cine", false);
	Checkbox chkCinco = new Checkbox("Correr", false);
	Checkbox chkSeis = new Checkbox("Informática", false);
	Checkbox chkSiete = new Checkbox("Juegos", false);
	Checkbox chkOcho = new Checkbox("Nutrición", false);
	Checkbox chkNueve = new Checkbox("Coches", false);
	Checkbox chkdiez = new Checkbox("Botánica", false);
	Button btnBoton1 = new Button ("Dime qué me gusta");
	Button btnBoton2 = new Button ("Dime qué me gusta");

	
	private static final long serialVersionUID = 1L;


	public Aficiones()
	{
		setLayout( new GridLayout( 2,10 ) );
		setTitle("Botones de Opción excluyentes");
		add(chkUno);
		add(chkDos);
		add(chkTres);
		add(chkCuatro);
		add(chkCinco);
		add(chkSeis);
		add(chkSiete);
		add(chkOcho);
		add(chkNueve);
		add(chkdiez);
		add(btnBoton1);
		addWindowListener(this);
		btnBoton1.addActionListener (this);
		setLocationRelativeTo(null);
		setSize(700,350);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Aficiones();

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
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String mensaje = "te gusta el ";
		if (chkUno.getState() == true) {
			mensaje += "Deporte ";
		}
		if (chkDos.getState() == true) {
			mensaje += ", Lectura";
		}
		if (chkTres.getState() == true) {
			mensaje += ", Cine";
		}
		if (chkCuatro.getState() == true) {
			mensaje += ", Correr";
		}
		if (chkCinco.getState() == true) {
			mensaje += ", Informática";
		}
		if (chkSeis.getState() == true) {
			mensaje += ", Juegos";
		}
		if (chkSiete.getState() == true) {
			mensaje += ", Nutrición";
		}
		if (chkOcho.getState() == true) {
			mensaje += ", Coches";
		}
		if (chkNueve.getState() == true) {
			mensaje += ", Botánica";
		}
		if (chkdiez.getState() == true) {
			mensaje += ", Lectura";
		}
		
		System.out.println(mensaje);

		
	}
}
