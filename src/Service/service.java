package Service;

import java.io.FileNotFoundException;
import java.util.Scanner;

import entities.Etd;

public interface service {

	public void Creer( Scanner scani, Scanner scans, Etd e);
	public void Afficherall(  );
	public void Afficher( String CNE );	
	public void Modifier( String CNE );
	public void supprimer( String CNE ) throws FileNotFoundException;
	public void Stocker();
	public void charger();
	public void trier();
	public Etd findEtd( String CNE );
	
}
