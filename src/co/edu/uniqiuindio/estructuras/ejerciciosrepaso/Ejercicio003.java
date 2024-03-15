package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import co.edu.uniquindio.estructuras.listaspropias.SimpleList;

public class Ejercicio003 {
	
	
	public static void main (String []args) {
		SimpleList<Integer> lista = new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		
		lista.reverse();
		lista.printListForwards();
	}

}
