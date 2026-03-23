package ejHashmap4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ELIZA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Palabras clave
		HashMap<String, String> respuestas = new HashMap<>();
		
		respuestas.put("hola", "Hola, ¿qué tal?");
		respuestas.put("encantado", "Encantado de conocerte yo también");
		respuestas.put("adios", "Adiós, espero verte pronto");
		respuestas.put("hora", "Lo siento, no llevo reloj");
		respuestas.put("nombre", "Mi nombre es Eliza");
		
		while (true) {
			
			System.out.print("Tú: ");
			String frase = sc.nextLine().toLowerCase();
			
			// opcional: salir del programa
            if (frase.equals("adios")) {
                System.out.println("Eliza: Hasta luego");
                break;
			
		}
		
		boolean encontrada = false;
		
		// recorrer el mapa
		for (Map.Entry<String, String> entrada : respuestas.entrySet()) {
			
			if (frase.contains(entrada.getKey())) {
				System.out.println("Eliza: " + entrada.getValue());
				encontrada = true;
				break;
			}
		}
		
		if (!encontrada) {
			System.out.println("Eliza: Lo siento, no te comprendo");
		}
	}
		
	sc.close(); 
	}
}
