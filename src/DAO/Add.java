package DAO;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import entities.Etd;

public interface Add {

	
	  // save data in a list as temporary storage . 
	
	public ArrayList<Etd> ajoute (Etd e);
	public void Stocker(  ) throws FileNotFoundException; 
	public ArrayList<Etd> Chager( );	
	
	
}
