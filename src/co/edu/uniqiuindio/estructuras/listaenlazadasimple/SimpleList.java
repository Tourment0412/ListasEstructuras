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
	 * @param node
	 */
	public void addToHead(Node <E> node) {
		if(head==null) {
			head=node;
			size++;
			return;
		}
		Node <E> auxiliar= head;
		head=node;
		head.setNext(auxiliar);
		size++;
	}
	/**
	 * This method is used for adding a new {@link Node} using its data (the correct way to be implemented)
	 * We should not use {@link Node} as parameter.
	 * @param value
	 */
	public void addToHeadByValue(E value) {
		Node <E> nodoPara= new Node<E>(value);
		if(head==null) {
			head= nodoPara;
			return;
		}
		Node<E> aux= head;
		head=nodoPara;
		head.setNext(aux);;
		
	}
	
	
	/**
	 * This method is used for adding a new {@link Node} to as the last node of the {@link SimpleList}
	 * @param value
	 */
	public void addToTail(E value) {
		Node <E> node=new Node <E>(value);
		if(head==null) {
			head=node;
			return;
		}
		Node <E> nodeAux= head;
		while (nodeAux.getNext()!=null) {
			nodeAux= nodeAux.getNext();
		}
		nodeAux.setNext(node);
		
	} 
	 public void addByPosition(E value,int pos) {
		 int cont =0;
		 Node <E> node= head;
		 while(node.getNext()!=null) {
			 
		 }
	 }
	

}
