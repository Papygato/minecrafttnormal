
import java.io.File;

import module.Fenetre;


public class Start {
	public static void main(String[] args){
		
		Fenetre appli = new Fenetre();
		File f = new File("test.txt");
	    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		//new FileBufferedReader("save.va");
		//new FileBufferedWriter("save.va");
	}
	
}
