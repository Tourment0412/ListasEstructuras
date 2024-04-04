package co.edu.uniquindio.estructuras.pruebas;

import co.edu.uniquindio.estructuras.listaspropias.Pila;

public class PruebasPilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila<Integer> pila = new Pila<Integer>();
		pila.push(40);
		pila.push(78);
		pila.push(12);
		pila.push(20);
		pila.push(10);
		System.out.println(pila);
		eliminarElementos(pila, 2, 4);
		System.out.println(pila);

	}
	
	public static <E> void eliminarElementos(Pila<E> p, int nivelInf, int nivelSup) {
		int lvl = 1;
		Pila<E> aux = new Pila<E>();
		while (!p.estaVacia()) {
			E element = p.pop();
			if (lvl < nivelInf || lvl > nivelSup)
				aux.push(element);
			lvl++;
		}
		while (!aux.estaVacia())
			p.push(aux.pop());
	}

}
