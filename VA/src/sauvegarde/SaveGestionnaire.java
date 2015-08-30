package sauvegarde;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.IntBuffer;

public class SaveGestionnaire {
	
	public SaveGestionnaire(){
		
		String path = "c:\\save.txt";
		InitiateFichier(path);

	}
	
	private boolean InitiateFichier(String path){
		boolean exist = false;
		
		try{
			BufferedReader In = new BufferedReader(new FileReader(path));
			System.out.println("Sauvegarde existante, chargement du profil");

		} catch (FileNotFoundException fnfe) {
			System.out.println("Pas de sauvegarde, initialisation du jeu");
			
		}
		return exist;
	}
	
	
}
