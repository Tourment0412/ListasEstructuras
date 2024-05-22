package co.edu.uniquindio.estructuras.arboles;

public class Persona implements Comparable<Persona> {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Persona otraPersona) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(otraPersona.getNombre());
	}
	
	
}
