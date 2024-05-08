package co.edu.uniquindio.estructuras.arboles;



public class Pruebas {

	public static void main(String []args) {
		BinaryTree<Integer> arbol= new BinaryTree<Integer>();
		arbol.add(43);
		arbol.add(10);
		arbol.add(8);
		arbol.add(54);
		arbol.add(15);
		arbol.add(50);
		arbol.add(53);
		
		
		System.out.println("Preorder");
		arbol.preOrder();
		System.out.println();
		System.out.println("Inorder");
		arbol.inOrder();
		System.out.println();
		System.out.println("Postorder");
		arbol.postOrder();
		System.out.println();
		
		System.out.println("Determinando existencia de elementos elementos:");
		System.out.println("Existe el 50?");
		System.out.println(arbol.isValueExisting(50));
		System.out.println("Existe el 23?");
		System.out.println(arbol.isValueExisting(23));
		
		System.out.println("Cantidad de nodos (Peso)");
		System.out.println(arbol.getWeight());
		
		System.out.println("Altura del arbol");
		System.out.println(arbol.getHeight());
		
		System.out.println("Nivel del 8");
		System.out.println(arbol.getLevel(8));
		
		System.out.println("Valor minimo");
		System.out.println(arbol.getMinValue()+"");
		
		System.out.println("Recorrido por amplitud (Va todos los nodos de un nivel y luego el otro)");
		arbol.breadthFirstTraversal();
		System.out.println();
		
		System.out.println("Nodo maximo");
		System.out.println(arbol.getMaxNode().getValue());
		
		System.out.println("Nodo minimo");
		System.out.println(arbol.getMinNode().getValue());
		
		/*System.out.println("Eliminar arbol");
		arbol.deleteTree();
		
		System.out.println(arbol.isEmpty());*/
		
		System.out.println("Suma de valores de nodos");
		System.out.println(arbol.getSumValues());
		
		System.out.println("Hojas");
		System.out.println(arbol.getQuantityLeafs());
		
		System.out.println("Elimando nodo 43");
		arbol.remove(43);
		arbol.inOrder();
		
		
		
	
		
		
	}
}
