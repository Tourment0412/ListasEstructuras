package co.edu.uniqiuindio.estructuras.listaenlazadasimple;

public class Node <E> {
	
	private E value;
	private Node <E> next;
	
	public Node(E valor) {
		this.value = valor;
		this.next=null;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	

}
