package co.edu.uniqiuindio.estructuras.ejerciciosrepaso;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio008 {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();

	}
	
	public static void removeOddKeyPairs(Map<Integer, String> map) {
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() % 2 != 0) {
                iterator.remove(); // Eliminar el par clave-valor con clave impar
            }
        }
	}    

}
