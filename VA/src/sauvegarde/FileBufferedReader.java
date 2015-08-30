package sauvegarde;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferedReader {

	protected String source;

	public FileBufferedReader(String source) {
		this.source = source;
		lecture();
	}


	private void lecture() {
		try {
			String ligne;
			BufferedReader fichier = new BufferedReader(new FileReader(source));

			while ((ligne = fichier.readLine()) != null) {
				System.out.println(ligne);
			}

			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
