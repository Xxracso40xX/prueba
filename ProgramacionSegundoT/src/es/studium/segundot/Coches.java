package es.studium.segundot;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Coches extends Frame implements WindowListener, ActionListener
{
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo3 = new CheckboxGroup();

	Checkbox chkUno = new Checkbox("Diesel", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("Gasolina", false, chkgrGrupo);
	Checkbox chkTres = new Checkbox("Híbrido", false, chkgrGrupo);
	Checkbox chkCuatro = new Checkbox("Eléctrico", false, chkgrGrupo);
	Checkbox chkCinco = new Checkbox("3", false, chkgrGrupo2);
	Checkbox chkSeis = new Checkbox("4", false, chkgrGrupo2);
	Checkbox chkSiete = new Checkbox("5", false, chkgrGrupo2);
	Checkbox chkOcho = new Checkbox("Metalizada", false, chkgrGrupo3);
	Checkbox chkNueve = new Checkbox("No metalizada", false, chkgrGrupo3);
	Button btnBoton1 = new Button ("Presupuesto");

	private static final long serialVersionUID = 1L;


	public Coches()
	{
		setLayout( new GridLayout( 5,12 ) );
		setTitle("Botones de Opción excluyentes");
		TextField Tipo = new TextField(20);
		add(chkUno);
		add(chkDos);
		add(chkTres);
		add(chkCuatro);
		TextField numero = new TextField(20);
		add(chkCinco);
		add(chkSeis);
		add(chkSiete);
		TextField pintura = new TextField(20);
		add(chkOcho);
		add(chkNueve);
		add(btnBoton1);
		addWindowListener(this);
		btnBoton1.addActionListener (this);
		setLocationRelativeTo(null);
		setSize(700,350);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Coches();

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
		Integer valor = 0; 
		String mensaje = "El precio del coche sería " + valor;

		if (chkUno.getState() == true) {
			valor = 8000;
		}else if (chkDos.getState() == true){
			valor = 7000;
		}else if(chkTres.getState() == true) {
			valor = 9000;
		}else if(chkCuatro.getState() == true) {
			valor = 8500;
		}
		
		if (chkCinco.getState() == true) {
			valor += 2000;
		}else if (chkSeis.getState() == true) {
			valor += 3000;
		}else if (chkSiete.getState() == true) {
			valor += 2500;
		}
		
		if (chkOcho.getState() == true) {
			valor += 0;
		}else if(chkNueve.getState() == true){
			valor += 1500;
		}
		
		System.out.println(valor);
			
			
	}
}