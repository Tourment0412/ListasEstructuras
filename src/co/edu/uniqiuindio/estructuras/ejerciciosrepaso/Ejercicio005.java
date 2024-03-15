package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import co.edu.uniquindio.estructuras.listaspropias.DoubleList;
import co.edu.uniquindio.estructuras.listaspropias.DoubleNode;

public class Ejercicio005 {

	public static void main(String[] args) {
		DoubleList<Integer> listaDoble= new DoubleList<Integer>();
		listaDoble.addToTail(1);
		listaDoble.addToTail(3);
		agregarEnOrden(2, listaDoble);
		listaDoble.printListForwards();
		System.out.println("----------");
		agregarEnOrden(4, listaDoble);
		listaDoble.printListForwards();
		System.out.println("----------");
		agregarEnOrden(0, listaDoble);
		listaDoble.printListForwards();
	}
	
	
	public static void agregarEnOrden (int dato, DoubleList<Integer> listaDoble) {
		DoubleNode<Integer> nodoIngreso= new DoubleNode<Integer>(dato);
		if(listaDoble.head==null) {
			listaDoble.head= nodoIngreso;
			listaDoble.tail= nodoIngreso;
			return;
		}
		
		DoubleNode<Integer> current= listaDoble.head;
		DoubleNode<Integer> prev= null;
		
		while(current!=null && dato>current.getValue()) {
			prev=current;
			current=current.getNext();
		}
		
		if(prev==null) {
			current.setPrevious(nodoIngreso);
			nodoIngreso.setNext(current);
			listaDoble.head=nodoIngreso;
			return;
		}
		if(current==null) {
			prev.setNext(nodoIngreso);
			nodoIngreso.setPrevious(prev);
			listaDoble.tail=nodoIngreso;
			return;
		}
		prev.setNext(nodoIngreso);
		nodoIngreso.setPrevious(prev);
		current.setPrevious(nodoIngreso);
		nodoIngreso.setNext(current);
	}

}
