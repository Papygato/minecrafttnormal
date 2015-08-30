package sauvegarde;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class FileBufferedWriter {
	
	protected String destination;

	public FileBufferedWriter(String destination) {
		this.destination = destination;
		traitement();
	}

	public static void main(String args[]) {

	}

	private void traitement() {
		try {
			int nombre = 123;
			BufferedWriter fichier = new BufferedWriter(new FileWriter(destination));

			fichier.write("bonjour tout le monde");
			fichier.newLine();
			fichier.write("Nous sommes le " + new Date());
			fichier.write(", le nombre magique est " + nombre);

			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
