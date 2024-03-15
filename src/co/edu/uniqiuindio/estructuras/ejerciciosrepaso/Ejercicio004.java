package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import co.edu.uniquindio.estructuras.listaspropias.SimpleList;

public class Ejercicio004 {

	public static void main(String[] args) {
		SimpleList<Integer> lista1= new SimpleList<Integer>();
		lista1.addToTail(1);
		lista1.addToTail(2);
		lista1.addToTail(5);
		lista1.addToTail(6);
		SimpleList<Integer> listaAgregar= new SimpleList<Integer>();
		listaAgregar.addToTail(3);
		listaAgregar.addToTail(4);
		lista1.agregarListaMain(2, listaAgregar);
		lista1.printListForwards();
	}

}
