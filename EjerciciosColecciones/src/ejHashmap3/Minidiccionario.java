package ejHashmap3;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
public class Minidiccionario {
	public static void main(String[] args) {
		
		var diccionario = new HashMap <String,String>();
		Scanner sc = new Scanner (System.in);
		
		// 10 palabras
		diccionario.put("hola", "hello");
		diccionario.put("adiós", "goodbye");
		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("rojo", "red");
		diccionario.put("verde", "green");
		diccionario.put("comer", "eat");
		diccionario.put("beber", "drink");
		diccionario.put("gráfico", "chart");
		
		
		ArrayList<String>seleccionadas = obtenerPalabras(diccionario,5);
		
		int puntos = 0;
		for ( String palabra:seleccionadas) {
			System.out.println(" Palabra en castellano:" +palabra);
			System.out.println("Palabra en inglés:");
			String palabraIng = sc.nextLine() toLowerCase();
			if ( diccionario.get(palabra).equals(palabraUsuario)) {
				System.out.println("Respuesta correcta");
				puntos++;
			} else {
				System.out.println("Respuesta incorrecta");
			}
		}
		
		private static ArrayList<String> obtenerPalabras(HashMap<String, String> diccionario, int numPalabras) {
		}
		
		var listaEspañol = new Arraylist <String>(diccionario.KeySet());
		var listaSeleccionada = new Arraylist <String>();
		var rd = new Random();
		
		for (int i=1; i <= numPalabras; i++) {
			int posicion = rd.nextInt(listaEspañol.size());
			String palabra = listaEspañol.get(posicion);
			listaSeleccionada.add(palabra);
		}
		
		return listaSeleccionada;
	}

}
