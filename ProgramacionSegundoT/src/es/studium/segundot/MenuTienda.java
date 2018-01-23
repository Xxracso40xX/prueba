package es.studium.segundot;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuTienda extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	// En primer lugar creamos la barra de menú
	MenuBar barraMenu = new MenuBar();
	// Ahora creamos los elementos principales del menú
	Menu menuArticulo = new Menu("Artículos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	// Y Ahora los elementos de cada opción del menú principal
	// Primero los de Archivo
	// menuArchivoNuevo contendrá otros elementos, por lo que es
	//tipo Menu
	MenuItem menuArticuloNuevo = new MenuItem("Nuevo Artículo");
	MenuItem menuArticuloEliminar = new MenuItem("Eliminar Artículo");
	MenuItem menuArticuloConsultar = new MenuItem("Consultar Cliente");
	// Luego los de Edición
	MenuItem menuClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem menuClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem menuClientesConsultar = new MenuItem("Consultar Cliente");
	//Por último, creamos los elementos dentro de Nuevo
	MenuItem menuFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem menuFacturasConsultar = new MenuItem("Consultar Factura");
	public MenuTienda()
	{
		setLayout (new FlowLayout());
		setTitle ("Menú" );
		//Establecemos la barra de menú
		setMenuBar(barraMenu);
		//Empezamos a añadirle los elementos
		//Primero a menuArchivoNuevo, le añadimos su submenus
		menuFacturas.add(menuFacturasConsultar);
		menuFacturas.add(menuFacturasNueva);
		//Seguimos con los elementos de archivo
		menuClientes.add(menuClientesConsultar);
		menuClientes.add(menuClientesEliminar);
		menuClientes.add(menuClientesNuevo);
		//Y ahora a edicion los suyos
		menuArticulo.add(menuArticuloConsultar);
		menuArticulo.add(menuArticuloEliminar);
		menuArticulo.add(menuArticuloNuevo);
		//Por último agregamos los elementos archivo y edicion a
		//la barra
		barraMenu.add(menuArticulo);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MenuTienda();
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
	
		
	}
	
}

