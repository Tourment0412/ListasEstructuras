package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import co.edu.uniquindio.estructuras.listaspropias.SimpleList;
import co.edu.uniquindio.estructuras.listaspropias.SimpleNode;

public class Ejercicio007 {

	public static void main(String[] args) {
		SimpleList<Integer> lista= new SimpleList<Integer>();
		lista.addToTail(1);
		lista.addToTail(2);
		lista.addToTail(3);
		lista.addToTail(2);
		lista.addToTail(-6);
		reemplazar2Coincidencia(lista);
		lista.printListForwards();

	}
	
	public static int calcularSuma(SimpleList<Integer> lista) {
		int suma=0;
		SimpleNode<Integer> current= lista.head;
		while(current!=null) {
			suma+=current.getValue();
			current= current.getNext();
		}
		return suma;
	}
	
	
	public static void reemplazar2Coincidencia(SimpleList<Integer> lista) {
		int suma= calcularSuma(lista);
		SimpleNode<Integer> current= lista.head;
		while(current!=null) {
			if(current.getValue()==suma) {
				SimpleNode<Integer> nodo= new SimpleNode<Integer>(2);
				SimpleNode<Integer> aux= current.getNext();
				current.setNext(nodo);
				nodo.setNext(aux);
				current= nodo.getNext();
			}else {
				current= current.getNext();
			}
		}
	}

}
