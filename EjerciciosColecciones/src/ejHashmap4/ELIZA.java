package ejHashmap4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

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
		
		//filtrado de palabras no adecuadas
		ArrayList<String> inadecuadas = new ArrayList<>();
		
		inadecuadas.add("mierda");
		inadecuadas.add("joder");
		inadecuadas.add("puta");
		inadecuadas.add("tonto");
		
		while (true) {
			
			System.out.print("Tú: ");
			String frase = sc.nextLine().toLowerCase();
			
			// opcional: salir del programa
            if (frase.equals("adios")) {
                System.out.println("Eliza: Hasta luego");
                break;
			
		}
            
         // filtro de palabras
            boolean ofensiva = false;

            for (String palabra : inadecuadas) {
                if (frase.contains(palabra)) {
                    ofensiva = true;
                    break;
                }
            }

            if (ofensiva) {
                System.out.println("Eliza: Ese mensaje no es adecuado");
                continue;
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
