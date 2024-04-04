package co.edu.uniquindio.estructuras.listaspropias;

public class Cola <E> {
	
	
	private SimpleNode<E> head;
	private SimpleNode <E> tail;
	private int size;
	
	
	public Cola() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public void encolar(E value) {
		SimpleNode<E> current= new SimpleNode<>(value);
		if(tail==null) {
			tail= current;
			head= current;
			size++;
			return;
		}
		tail.setNext(current);
		tail=current;
		size++;
	}
	/**
	 * Es importante retornar el elemento primero, por que para saber que elementos hay en la cola hay que 
	 * desencolar, por lo que se ve
	 * @return aux, valor del nodo primero o cabeza
	 */
	public E desencolar() {
		if(head==null) {
			throw new RuntimeException("Cola vacia");
		}
		E aux= head.getValue();
		head= head.getNext();
		size--;
		return aux;
	}
	
	public boolean isVacia() {
		return head==null;
	}
	
	public boolean isLLena() {
		return head!=null;
	}
	
	public SimpleNode<E> getHead(){
		return head;
	}
	public int size() {
		return size;
	}
	
	public Cola<E> copyOf(){
		Cola<E> cola= new Cola<>();
		if(this.head==null) {
			return cola;
		}
		cola.head= this.head;
		cola.tail=this.tail;
		cola.size= this. size;
		return cola;
	}

	public SimpleNode<E> getTail() {
		return tail;
	}

	public void setTail(SimpleNode<E> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setHead(SimpleNode<E> head) {
		this.head = head;
	}
	

}
