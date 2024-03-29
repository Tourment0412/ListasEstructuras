package co.edu.uniquindio.estructuras.listaspropias;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleList<E> implements Iterable<E> {

	public DoubleNode<E> head;
	public DoubleNode<E> tail;
	public int size;

	public DoubleList() {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void addToHead(E value) {
		DoubleNode<E> current = new DoubleNode<E>(value);
		if (head == null) {
			head = current;
			tail = current;
			return;
		}
		head.setPrevious(current);
		current.setNext(head);
		head = current;
	}

	public void addToTail(E value) {
		DoubleNode<E> current = new DoubleNode<E>(value);
		if (tail == null) {
			tail = current;
			head = current;
			return;
		}
		tail.setNext(current);
		current.setPrevious(tail);
		tail = current;
	}

	public void printListForwards() {
		DoubleNode<E> current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}

	public void imprimirHaciaAtras() {
		DoubleNode<E> current = tail;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getPrevious();
		}
	}

	@Override
	public DoubleListIterator iterator() {
		return new DoubleListIterator(head);
	}

	private class DoubleListIterator implements Iterator<E> {
		private DoubleNode<E> head;

		public DoubleListIterator(DoubleNode<E> head) {
			this.head = head;
		}

		@Override
		public boolean hasNext() {
			return head != null;
		}

		public boolean hasPrevious() {
			return head != null;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			E e = head.getValue();
			head = head.getNext();
			return e;
		}

		public E previous() {
			if (!hasPrevious()) {
				throw new NoSuchElementException();
			}
			E e = head.getValue();
			head = head.getPrevious();
			return e;
		}

	}

}
