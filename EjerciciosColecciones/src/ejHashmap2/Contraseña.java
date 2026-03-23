package ejHashmap2;
import java.util.Scanner;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Contraseña {
	public static void main(String argv[]) {

		HashMap<String, String> thAcceso = new HashMap<String, String>();

		final int NUM_INTENTOS_MAX = 3; // número máximo de intentos
		int intentos = 0;
		

		Scanner sc = new Scanner(System.in);
		String usuario, clave;

		// Relleno el hashMap con usuario y contraseña
		thAcceso.put("admin", "admin");
		thAcceso.put("maria", "1234");
		thAcceso.put("root", "root");

		boolean acceso = false; // Tiene o no acceso
		do {

			usuario = JOptionPane.showInputDialog("Usuario :");
			clave = JOptionPane.showInputDialog("Contraseña :");

			// Si esta definido el nombre de usuario
			String contraseña = thAcceso.get(usuario);
			// Si no es null es igual
			if (contraseña != null && contraseña.equals(clave)) {
				acceso = true;
			} else {

				JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Informacion",
						JOptionPane.WARNING_MESSAGE);
			}
			intentos++;
		} while (!acceso && intentos < NUM_INTENTOS_MAX);

		if (acceso) {
			JOptionPane.showMessageDialog(null, "Acceso concedido", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Superado número máximo de intentos", "Informacion",
					JOptionPane.ERROR_MESSAGE);

		}
	}
}