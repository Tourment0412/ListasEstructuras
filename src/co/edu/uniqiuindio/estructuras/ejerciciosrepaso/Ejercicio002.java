package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import co.edu.uniquindio.estructuras.listaspropias.SimpleList;
import co.edu.uniquindio.estructuras.listaspropias.SimpleNode;

/**
 * Realizar un método recursivo booleano en Java que, recibiendo dos listas como
 * parámetro,compruebe si cada uno de los elementos de la segunda lista está
 * contenido en la primera. OBSERVACIONES: <p> se asumira las listas en ordenadas
 * 
 * <li>No se permitirá la utilización de estructuras de datos auxiliares. 
 * <li>No se permitirá la realización de más de un recorrido en ninguna de las dos listas.
 * <li>Se prestará especial atención al número de elementos visitados en la
 * solución.
 * 
 * 
 */

public class Ejercicio002 {

	
	public static void main(String[] args) {
		
		SimpleList<Integer> lista1= new SimpleList<Integer>();
		lista1.addToTail(1);
		lista1.addToTail(2);
		lista1.addToTail(3);
		lista1.addToTail(4);
		lista1.addToTail(5);
		
		SimpleList<Integer> lista2= new SimpleList<Integer>();
		lista2.addToTail(4);
		lista2.addToTail(6);
		System.out.println(comprobarContencion(lista1, lista2));
	}
	
	
	public static boolean comprobarContencion(SimpleList<Integer> lista1, SimpleList<Integer> lista2) {
		
		SimpleNode<Integer> current1=lista1.head;
		SimpleNode<Integer> current2=lista2.head;
		if(current1==null) {
			return false;
		}
		if(current2==null) {
			return true;
		}
		
		return comprobarContencion(current1,current2);
	}


	private static boolean comprobarContencion(SimpleNode<Integer> current1, SimpleNode<Integer> current2) {
		if(current2==null) {
			return true;
		}
		if(current1==null) {
			return false;
		}
		if(current1.getValue().equals(current2.getValue())) {
			return comprobarContencion(current1.getNext(), current2.getNext());
		}
		return comprobarContencion(current1.getNext(), current2);
	}

}
