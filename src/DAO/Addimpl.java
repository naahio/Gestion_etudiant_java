package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Scanner;

import Control.Main;
import entities.Etd;

public class Addimpl implements Add{
	
	File Mytxt = new File("List_Etd.txt");
	Main s;
	
	@Override
	public ArrayList<Etd> ajoute(Etd e) {
		
			s.list.add(e);
			
			System.out.println(" --> etd  "+e.getNom()+" has been added ! ");
		return s.list;
	}

	@Override
	public void Stocker() throws FileNotFoundException{
		
		try{
		    FileOutputStream writeData = new FileOutputStream("Etd_list.txt");
		    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

		    writeStream.writeObject(s.list);
		    writeStream.flush();
		    writeStream.close();
		    System.out.println(" Stockage terminer ! ");
		}catch (IOException e) {
		    e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Etd> Chager() {

		try{
		    FileInputStream readData = new FileInputStream("Etd_list.txt");
		    // deepcode ignore introduceBuffering~java.io.ObjectInputStream~1: <please specify a reason of ignoring this>		    ObjectInputStream readStream = new ObjectInputStream(readData);

		    s.list = (ArrayList<Etd>) readStream.readObject();
		    readStream.close();
		    System.out.println(" chargement terminer ! ");
		    return s.list;
		}catch (Exception e) {
		    e.printStackTrace();
		}
 return null;
}
}
