package es.studium.segundot;

import java.awt.*;
public class AwtList extends Frame
{
	private static final long serialVersionUID = 1L;
	//Creación de una lista con 4 elementos visibles y que no
	//permite multiselección
	List choLista = new List(4, false);
	List choLista2 = new List(4, true);
	public AwtList()
	{
		setLayout(new FlowLayout());
		setTitle("Lista");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		choLista.add("Verde");
		choLista.add("Amarillo");
		choLista.add("Naranja");
		
		setLayout(new FlowLayout());
		setTitle("Lista 2");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		choLista.add("Verde");
		choLista.add("Amarillo");
		choLista.add("Naranja");
		
		add(choLista);
		add(choLista2);
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new AwtList();
	}
}