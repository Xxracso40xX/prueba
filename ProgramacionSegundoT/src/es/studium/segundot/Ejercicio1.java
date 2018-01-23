package es.studium.segundot;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 extends Frame implements WindowListener
{
 private static final long serialVersionUID = 1L;
 
Label etiquetaCelsius = new Label ("Celsius");
Label etiquetaFarenheit = new Label ("Farenheit");
TextField gradosCelsiusInput = new TextField(20);
TextField gradosFarenheitInput = new TextField(20);
Button btnBoton1 = new Button("Convertir de Cª a Fª");
Button btnBoton2 = new Button("Convertir de Fª a Cª");

public Ejercicio1()
{
//Establecer la distribución con 3 filas y 4 columnas
setLayout( new GridLayout( 3,4 ) );
add(etiquetaCelsius);
add(gradosCelsiusInput);
add(etiquetaFarenheit);
add(gradosFarenheitInput);
add(btnBoton1);
add(btnBoton2);
addWindowListener(this);
setSize(200,200);
setLocationRelativeTo(null);
setVisible(true);
}
//Fin del Constructor
public static void main(String[] args)
{
new Ejercicio1();
}
//A continuación debemos colocar TODOS los métodos de la clase
//abstracta WindowListener, aunque solamente vayamos a trabajar
//con el método windowClosing()
public void windowActivated(WindowEvent we) {}
public void windowClosed(WindowEvent we) {}
public void windowClosing(WindowEvent we)
{
	//Llamamos al método exit de la clase System,
	//devolviendo como código de salida un 0
	System.exit(0);
}
public void windowDeactivated(WindowEvent we) {}
public void windowDeiconified(WindowEvent we) {}
public void windowIconified(WindowEvent we) {}
public void windowOpened(WindowEvent we) {}
}
//Fin del main
//Fin de la clase
