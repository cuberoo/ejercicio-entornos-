package operar_arrays;

public class Mostrar_Arrays {

	public static void main(String[] args) {
	int array [] =  creaArrayNumerosAzar(20, 1, 20);
	mostrarArray(array);
	}

	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}
	
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
