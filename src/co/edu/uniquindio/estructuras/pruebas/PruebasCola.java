package co.edu.uniquindio.estructuras.pruebas;



import co.edu.uniqiuindio.estructuras.listaenlazadasimple.Persona;
import co.edu.uniquindio.estructuras.listaspropias.Cola;


public class PruebasCola {

	public static void main(String[] args) {
		Cola<Persona> cola= new Cola<Persona>();
		cola.encolar(new Persona(10, "Santiago"));
		cola.encolar(new Persona(20, "Juan"));
		cola.encolar(new Persona(30, "Pepe"));
		cola.encolar(new Persona(30, "Ana"));
		cola.encolar(new Persona(30, "Pepe"));
		System.out.println(cola.getSize());
		Cola<Persona> clon= cola.copyOf();
		imprimirCola(clon);
		System.out.println("Original: "+cola.getSize());
		System.out.println("Clon: "+clon.getSize());
		eliminarPersonaP(cola);
		imprimirCola(cola);
	}
	
	public static void imprimirCola(Cola<Persona> cola) {
		while(cola.isLLena()) {
			System.out.println(cola.desencolar().toString());
			
		}
	}
	
	public static void eliminarPersonaP(Cola<Persona> cola) {
		int size=0;
		while(size<=cola.size()) {
			Persona persona= cola.desencolar();
			if(!(persona.getNombre().startsWith("P")||persona.getNombre().startsWith("p"))) {
				cola.encolar(persona);
			}
			size++;
		}
	}

}
