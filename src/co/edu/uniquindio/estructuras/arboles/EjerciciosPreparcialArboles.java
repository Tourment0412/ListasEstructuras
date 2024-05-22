package co.edu.uniquindio.estructuras.arboles;

import java.util.LinkedList;

public class EjerciciosPreparcialArboles {

	public static void main(String[] args) {
		/*
		 * Escriba un método recursivo que retorne la suma de todos los números que
		 * pertenecen a los niveles pares de un árbol binario de tipo float.
		 */
		System.out.println("Punto arbol flotante");
		BinaryTree<Float> arbolFlotante= new BinaryTree<Float>();
		arbolFlotante.add(10f);
		arbolFlotante.add(8f);
		arbolFlotante.add(12f);
		arbolFlotante.add(6f);
		arbolFlotante.add(9f);
		arbolFlotante.add(11f);
		arbolFlotante.add(13f);
		arbolFlotante.add(5f);
		arbolFlotante.add(7f);
		
		arbolFlotante.inOrder();
		
		System.out.println("Suma niveles pares: contandoo la raiz como 1: ");
		System.out.println(getSumEvenLevels(arbolFlotante));
		System.out.println(arbolFlotante.getHeight());
		
		System.out.println("Punto nombres de personas");
		BinaryTree<Persona> arbolPersonas = new BinaryTree<Persona>();
		arbolPersonas.add(new Persona("Ana"));
		arbolPersonas.add(new Persona("Juanaa"));
		arbolPersonas.add(new Persona("Santi"));
		arbolPersonas.add(new Persona("uriol"));
		arbolPersonas.add(new Persona("Elises"));
		arbolPersonas.add(new Persona("Gaspar"));
		arbolPersonas.add(new Persona("Ismenia"));
		arbolPersonas.add(new Persona("orion"));
		arbolPersonas.add(new Persona("anastasio"));
		
		LinkedList<Persona> personas= obtenerPersonasVocal(arbolPersonas);
		for(Persona personaRef: personas) {
			System.out.println(personaRef.getNombre());
		}
		
	}
	
	public static float getSumEvenLevels(BinaryTree<Float> arbolFlotante) {
		return getSumEvenLevelsRecur(arbolFlotante.getRoot(), 1);
	}

	private static float getSumEvenLevelsRecur(BinaryTreeNode<Float> node, int level) {
		if (node == null) {
			return 0;
		}
		float suma=0f;
		if(level%2==0) {
			suma+=node.getValue();
		}
		suma+= getSumEvenLevelsRecur(node.getLeft(), level+1);
		suma+= getSumEvenLevelsRecur(node.getRight(), level+1);
		
		return suma;
	}
	public static LinkedList<Persona> obtenerPersonasVocal(BinaryTree<Persona> personas){
		
		LinkedList<Persona> personasSelect= new LinkedList<Persona>();
		obtenerPersonasVocalRecur(personas.getRoot(),personasSelect);
		return personasSelect;
	}

	private static void obtenerPersonasVocalRecur(BinaryTreeNode<Persona> node,
			LinkedList<Persona> personasSelect) {
		if(node == null) {
			return;
		}
		Persona persona = node.getValue();
		if(isVocal(persona.getNombre().charAt(0))) {
			personasSelect.add(persona);
		}
		obtenerPersonasVocalRecur(node.getLeft(), personasSelect);
		obtenerPersonasVocalRecur(node.getRight(), personasSelect);
	}
	
	public static boolean isVocal(char caracter) {
		char caracter2= Character.toLowerCase(caracter);
		return caracter2=='a'||caracter2=='e'||caracter2=='i'||caracter2=='o'||caracter2=='u';
				
	}
}
