
import java.io.File;

import module.Fenetre;
import sauvegarde.SaveGestionnaire;


public class Start {
	public static void main(String[] args){
		
		Fenetre appli = new Fenetre();
		File f = new File("save.txt");
	    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
	    SaveGestionnaire gestFile = new SaveGestionnaire();
		//new FileBufferedReader("save.va");
		//new FileBufferedWriter("save.va");
	}
	
}
