package co.edu.uniqiuindio.estructuras.listaenlazadasimple;

public class SimpleList <E> {
	public Node <E> head;
	public int size;
	
	
	
	
	public SimpleList() {
		this.head = null;
		this.size=0;
	}



	/**
	 *  This method is used for adding a new {@link Node} to the list
	 * @param nodo
	 */
	public void agregarInicio(Node <E> nodo) {
		if(head==null) {
			head=nodo;
			size++;
			return;
		}
		Node <E> auxiliar= head;
		head=nodo;
		head.setNext(auxiliar);
		size++;
	}
	/**
	 * This method is used for adding a new {@link Node} using its data (the correct way to be implemented)
	 * We should not use {@link Node} as parameter.
	 * @param valor
	 */
	public void agregarInicioValor(E valor) {
		Node <E> nodoPara= new Node<E>(valor);
		if(head==null) {
			head= nodoPara;
			return;
		}
		Node<E> aux= head;
		head=nodoPara;
		head.setNext(aux);;
		
	}
	
	//Tambien podemos hacerlo asignando un valor de previous a un nodo
	

}
