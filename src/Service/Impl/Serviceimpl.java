package Service.Impl;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import Control.Main;
import DAO.Add;
import DAO.Addimpl;
import Service.service;
import entities.Etd;


public class Serviceimpl implements service{

	
	Etd e;
	Main a ;
	Scanner scan = new Scanner(System.in);
	@Override
	public void Creer(Scanner scani, Scanner scans, Etd e) {

		//e.setId(  e.count.incrementAndGet()  ) ;  // type proble; 
	e.setCount();	
	System.out.println(" donner nom de l etudiant    : ");
	e.setNom(scans.next());
	System.out.println(" donner prenom de l etudiant : ");
	e.setPrenom(scans.next());
	System.out.println(" donner le CNE de l etudiant : ");
	e.setCNE(scans.next());
	System.out.println(" donner le CIN de l etudiant ");
	e.setCIN(scans.next());
	System.out.println(" donner le Moyenne de l etudiant ");
	e.setMoy(scani.nextFloat());
	
		System.out.println(" ---> etd  "+e.getNom()+" has been created !! ");
	
	}

	@Override
	public void Afficherall() {
		service service = new Serviceimpl();
		for(  int i=0; i<a.list.size(); i++ )
		{
			e = a.list.get(i);
			service.Afficher(e.getCNE());	
		}
		
		
	}

	@Override
	public void Afficher(String CNE) {
		System.out.println("      ===========|  Affiche Etudiant  |=========== "+CNE);
		
		service service = new Serviceimpl();
		
		Etd e = service.findEtd(CNE);
		if(e == null)
		{
			System.out.println(" Etd introvable ! ");
		}
		else
		{
		System.out.println(" ===> Numero  : "+e.getId());
		System.out.println(" ===> Nom     : "+e.getNom());
		System.out.println(" ===> Prenom  : "+e.getPrenom());
		System.out.println(" ===> CNE     : "+e.getCNE());
		System.out.println(" ===> CIN     : "+e.getCIN());
		System.out.println(" ===> Moyenne : "+e.getMoy());
		}
	}

	@Override
	public void Modifier(String CNE) {
		
		int f =0;
			for(int i =0; i<a.list.size(); i++)
			{
				String k;
				e = a.list.get(i);
				if( e.getCNE().compareTo(CNE) == 0 )
				{
					do {
					f=1;
					
					System.out.println("Num : '"+e.getId()+"' | Nom : '"+e.getNom()+"' | Prenom : '"+e.getPrenom()+"' | CNE : '"+e.getCNE()+"' | CIN : '"+e.getCIN()+"' | Moyenne : '"+e.getMoy() );
					System.out.println("Q => quitter");
					k = scan.next();
					switch (k) {
					case "Nom": 
						System.out.println("       Nom :  "+e.getNom());
						System.out.println(" donnez new Nom  : ");
						e.setNom(scan.next());
						break; 
					case "Prenom":
						System.out.println("       Prenom :  "+e.getPrenom());
						System.out.println(" donnez new Prenom  : ");
						e.setPrenom(scan.next());
						break;
					case "CNE":
						System.out.println("       CNE :  "+e.getCNE());
						System.out.println(" donnez new CNE  : ");
						e.setCNE(scan.next());
						break;
					case "CIN":
						System.out.println("       CIN :  "+e.getCIN());
						System.out.println(" donnez new CIN  : ");
						e.setCIN(scan.next());
						break;
					case "Moyenne":
						System.out.println("       Moyenne :  "+e.getMoy());
						System.out.println(" donnez new Moyenne  : ");
						e.setMoy(scan.nextFloat());
						break;
					case "Q":
						break;
						
					default : System.out.println("Unexpected value: " + k);
					}
					}while( k.compareTo("Q") != 0 );
				}
			}
			
			if(f == 0)
			{
				System.out.println("        -----------> erreur ! etd introuvable !");
			}
		
	}

	@Override
	public void supprimer(String CNE) throws FileNotFoundException {
		
			Etd e =  findEtd(CNE);
			Etd t;
			int y=0;
			for (int i = 0;  i < a.list.size(); i ++) {
				t = a.list.get(i);
				
				if ( t.getCNE().compareTo(e.getCNE()) == 0 )
				{
					y =1;
					a.list.remove(i);
					Add add = new Addimpl();
					add.Stocker();
					System.out.println(" Etd removed seccessfuly ! ");
				}
				
			}
			if(y == 0)
			{
				System.out.println("       ===> Etd introuvable ! ");
			}
		
	}

	@Override
	public void Stocker() {
		
		
		
		
	}

	@Override
	public void charger() {

		
		
	}

	@Override
	public void trier() {
		if(a.list.isEmpty())
		{
			System.out.println(" List Vide !!!! ");
		}else {
		Collections.sort(a.list);
		
		Afficherall();
		}
	}

	@Override
	public Etd findEtd(String CNE) {
			
						
			for(int i=0; i<a.list.size(); i++)
			{
				e=a.list.get(i);
				
				if( e.getCNE().compareTo(CNE) == 0 )
				{
					return e;
					
				}
			}
		
		return null;
	}

	

}
