package co.edu.uniqiuindio.estructuras.listaenlazadasimple;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Pruebas {
	public static void main (String []args) {
		
		
		HashSet<String> set= new HashSet<String>();
		System.out.println(set.add("Hola"));
		System.out.println(set.add("Hola"));
		
		
		System.out.println(set.size());
		Persona per = new Persona(2);
		
		//TreeSet<String> treeset= new TreeSet<String>();
		
		//System.out.println(treeset.add(null));
		
		TreeSet<Persona> treeset1= new TreeSet<>(Comparator.comparingInt(value -> value.getEdad()));
		System.out.println(treeset1.add(per));
		System.out.println(treeset1.add(per));
			
		TreeMap<String, String> treemap= new TreeMap<String, String>();
		treemap.put("i", null);
		treemap.put("i", null);
		System.out.println("tam: "+treemap.size());
		
		
	
		
		
		LinkedList<Integer> linked =  new LinkedList<Integer>();
		System.out.println(linked.add(2));
		System.out.println(linked.add(2));
		
		
		
	}
}
