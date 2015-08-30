package sauvegarde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SaveGestionnaire {
	
	public SaveGestionnaire(){
		
		String path = "C:\\Users\\aurelien\\git\\minecrafttnormal\\VA\\save.txt";
		if (isFichier(path)){
			
		}else{
			createFichierSave("");
			isFichier(path);
		}
			

	}
	
	private boolean isFichier(String path){
		boolean exist = false;
		
		try{
			BufferedReader In = new BufferedReader(new FileReader(path));
			System.out.println("Sauvegarde existante, chargement du profil");
			 exist = true;
			 
		} catch (FileNotFoundException fnfe) {
			System.out.println("Pas de sauvegarde detectée");
			exist = false;
		}
		return exist;
	}
	
	private void createFichierSave(String maitreName){
		
		//TODO Remplir maitre Nme a modifier une fois avancement atteint
		if (maitreName ==""){
			maitreName = "MaitreNameTest";
		}
		
		try{
			System.out.println("Creation du fichier de sauvegarde");
			File f = new File("C:/save.txt");
			System.out.println("Fichier de sauvegarde crée");
			System.out.println("Emplacement : " + f.getAbsolutePath());
			
		} catch (Exception exception) {
			System.out.println("Impossible de creer le fichier");

		}

	}
	
	
}
