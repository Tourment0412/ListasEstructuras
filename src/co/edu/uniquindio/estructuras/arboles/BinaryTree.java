package co.edu.uniquindio.estructuras.arboles;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BinaryTree<E extends Comparable<E>> {

	private BinaryTreeNode<E> root;

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTreeNode<E> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<E> root) {
		this.root = root;
	}

	public void inOrder() {
		inOrderAux(root);
	}

	private void inOrderAux(BinaryTreeNode<E> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		inOrderAux(root.getLeft());
		System.out.print(root.getValue() + ",");
		inOrderAux(root.getRight());

	}

	public void preOrder() {
		preOrderAux(root);
	}

	private void preOrderAux(BinaryTreeNode<E> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		System.out.print(root.getValue() + ",");
		preOrderAux(root.getLeft());
		preOrderAux(root.getRight());
	}

	public void postOrder() {
		postOrderAux(root);
	}

	private void postOrderAux(BinaryTreeNode<E> root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		postOrderAux(root.getLeft());
		postOrderAux(root.getRight());
		System.out.print(root.getValue() + ",");
	}
	// OPERACIONES DEL ARBOL BINARIO

	/**
	 * Operation to determinate if a BinaryTree is empty or not
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Main method for adding a new value to the tree following the rules of a
	 * binary tree
	 * 
	 * @param value
	 */
	public void add(E value) {
		root = addRecursively(root, value);
	}

	private BinaryTreeNode<E> addRecursively(BinaryTreeNode<E> node, E value) {
		if (node == null) {
			return new BinaryTreeNode<E>(value);
		}
		int comparation = value.compareTo(node.getValue());
		if (comparation < 0) {
			node.setLeft(addRecursively(node.getLeft(), value));
		} else if (comparation > 0) {
			node.setRight(addRecursively(node.getRight(), value));
		}
		return node;
	}

	/**
	 * Method for determining if a value exists in the tree
	 * 
	 * @param value
	 * @return
	 */
	public boolean isValueExisting(E value) {
		return isValueExistingAux(root, value);
	}

	/**
	 * Method that recursively traverses the tree to its leafs, checks if the value
	 * is the current node value, if not it searches the left side, if it is not
	 * found in all the left side it proceeds to search in the right side.
	 * 
	 * @param node
	 * @param value
	 * @return
	 */
	private boolean isValueExistingAux(BinaryTreeNode<E> node, E value) {
		if (node == null) {
			return false;
		}

		if (value.equals(node.getValue())) {
			return true;
		}
		boolean leftResult = isValueExistingAux(node.getLeft(), value);
		if (leftResult) {
			return leftResult;
		}
		return isValueExistingAux(node.getRight(), value);
	}

	/**
	 * Main method to get the weight of a node
	 * 
	 * @return
	 */
	public int getWeight() {
		return getWeightRecursively(root);
	}

	/**
	 * Method that recursively traverses the tree obtaining the number of nodes on
	 * the left and then on the right adding one to add the current node to the
	 * quantity.
	 * 
	 * @param node
	 * @return
	 */
	private int getWeightRecursively(BinaryTreeNode<E> node) {
		if (node == null) {
			return 0;
		}
		int cantA = getWeightRecursively(node.getLeft());
		int cantB = getWeightRecursively(node.getRight());
		return 1 + cantA + cantB;
	}

	/**
	 * Main method to get the level of a node
	 * 
	 * @param value
	 * @return
	 */
	public int getLevel(E value) {
		return getLevelAux(root, value, 0);
	}

	/**
	 * Busca por todo el arbol el nodo, y va sumando su nivel por cada izquierda o
	 * derecha que se haga para encontrarlo, y si llega a una hoja retorna -1, para
	 * que con el encontrado el nivel sea mayor
	 * 
	 * @param node
	 * @param value
	 * @param i
	 * @return
	 */
	private int getLevelAux(BinaryTreeNode<E> node, E value, int i) {
		if (node == null) {
			return -1;
		}
		if (value.equals(node.getValue())) {
			return i;
		}
		int levelLeft = getLevelAux(node.getLeft(), value, i + 1);
		int levelRight = getLevelAux(node.getRight(), value, i + 1);
		if (levelLeft > levelRight) {
			return levelLeft;
		}
		return levelRight;
	}

	/**
	 * Iterative solution, where we use a while until left ==null
	 * 
	 * @return
	 */
	public E getMinValue() {
		if (this.root == null) {
			return null;
		}
		BinaryTreeNode<E> current = this.getRoot();
		while (current.getLeft() != null) {
			current = current.getLeft();
		}
		return current.getValue();

	}

	public void breadthFirstTraversal() {
		if (this.root == null) {
			System.out.println("La raiz es vacia");
			return;
		}
		Queue<BinaryTreeNode<E>> cola = new LinkedList<>();
		cola.offer(root);
		while (!cola.isEmpty()) {
			BinaryTreeNode<E> actual = cola.poll();
			System.out.print(actual.getValue() + ",");

			if (actual.getLeft() != null) {
				cola.offer(actual.getLeft());
			}
			if (actual.getRight() != null) {
				cola.offer(actual.getRight());
			}
		}
	}

	public BinaryTreeNode<E> getMaxNode() {
		if (this.root == null) {
			return null;
		}
		BinaryTreeNode<E> current = this.getRoot();
		while (current.getRight() != null) {
			current = current.getRight();
		}
		return current;
	}

	public BinaryTreeNode<E> getMinNode() {
		if (this.root == null) {
			return null;
		}
		BinaryTreeNode<E> current = this.getRoot();
		while (current.getLeft() != null) {
			current = current.getLeft();
		}
		return current;
	}

	public void deleteTree() {
		this.root = null;
		System.out.println("Tree was deleted");
	}

	public void remove(E value) {
		if (this.isEmpty()) {
			throw new NoSuchElementException("El arbol esta vacio");
		}
		this.root = removeRecursively(root, value);
	}

	private BinaryTreeNode<E> removeRecursively(BinaryTreeNode<E> node, E value) {
		if (node == null) {
			return null;
		}
		if (value.compareTo(node.getValue()) < 0) {
			node.setLeft(removeRecursively(node.getLeft(), value));
		} else if (value.compareTo(node.getValue()) > 0) {
			node.setRight(removeRecursively(node.getRight(), value));
		} else {
			if (node.getLeft() == null && node.getRight() == null) {
				node = null;
			} else if (node.getLeft() == null) {
				node = node.getRight();
			} else if (node.getRight() == null) {
				node = node.getLeft();
			} else {
				E minRight = obtenerMinRight(node.getRight());
				node.setValue(minRight);
				node.setRight(removeRecursively(node.getRight(), node.getValue()));
			}

		}
		return node;

	}

	private E obtenerMinRight(BinaryTreeNode<E> right) {
		while (right.getLeft() != null) {
			right = right.getLeft();
		}
		return right.getValue();
	}

	/*
	 * Metodos de taller foto
	 */

	public int getSumValues() {
		return getSumValuesAux(root);
	}

	private int getSumValuesAux(BinaryTreeNode<E> node) {
		if (node == null) {
			return 0;
		}
		int sumLeft = getSumValuesAux(node.getLeft());
		int sumRight = getSumValuesAux(node.getRight());
		return (int) node.getValue() + sumLeft + sumRight;
	}

	// Metodo buscar en arbol binario
	public E searchValue(E value) {
		return searchValueAux(root, value);
	}

	private E searchValueAux(BinaryTreeNode<E> node, E value) {
		if (node == null) {
			return null;
		}

		if (value.equals(node.getValue())) {
			return node.getValue();
		}
		E leftValue = searchValueAux(node.getLeft(), value);
		if (leftValue != null) {
			return leftValue;
		}

		return searchValueAux(node.getRight(), value);
	}

	// Algoritmo para contar hojas
	public int getQuantityLeafs() {
		return getQuantityLeafsAux(root);
	}

	private int getQuantityLeafsAux(BinaryTreeNode<E> node) {
		if (node == null) {
			return 0;
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return 1;
		}

		int izq = getQuantityLeafsAux(node.getLeft());
		int der = getQuantityLeafsAux(node.getRight());
		return izq + der;
	}

	/*
	 * Ejercicios de Preparcial Arboles
	 */

	/*
	 * Escriba un método recursivo que retorne la suma de todos los números que
	 * pertenecen a los niveles pares de un árbol binario de tipo float.
	 * 
	 * Este como pide un arbol especifico se hace en la clase main
	 */

	/*
	 * Escribir una función recursiva que encuentre la altura de un árbol binario
	 */

	/**
	 * Main method to get the height of a tree (Length of the longest path +1)
	 * 
	 * @return
	 */
	public int getHeight() {
		return getHeightAux(root);
	}

	/**
	 * Traverse the tree recursively finding the highest height of the subtrees and
	 * command 1 at each node to the highest, the null nodes return 0 so that the
	 * leafs can return 1 and make the height the longest path plus 1.
	 * 
	 * @param node
	 * @return
	 */
	private int getHeightAux(BinaryTreeNode<E> node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int alturaIzquierda = getHeightAux(node.getLeft());
		int alturaDerecha = getHeightAux(node.getRight());
		if (alturaIzquierda > alturaDerecha) {
			return alturaIzquierda + 1;
		}
		return alturaDerecha + 1;
	}
	
	/*
	 * Retornar la altuta del arbol sin recursividad
	 * 
	 * En este caso con recorridos en amplitud
	 */
	
	public int alturaIterativa() {
        if (root == null) {
            return 0;
        }

        Queue<BinaryTreeNode<E>> cola = new LinkedList<>();
        cola.offer(root);
        int altura = 0;

        while (!cola.isEmpty()) {
            int nivelNodos = cola.size();
            altura++;

            for (int i = 0; i < nivelNodos; i++) {
                BinaryTreeNode<E> nodoActual = cola.poll();
                if (nodoActual.getLeft() != null) {
                    cola.offer(nodoActual.getLeft());
                }
                if (nodoActual.getRight() != null) {
                    cola.offer(nodoActual.getRight());
                }
            }
        }

        return altura;
    }

}
