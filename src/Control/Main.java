package Control;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import DAO.Add;
import DAO.Addimpl;
import Service.service;
import Service.Impl.Serviceimpl;
import entities.Etd;

public class Main {

	public static ArrayList<Etd> list = new ArrayList< Etd >();
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanS = new Scanner(System.in);
		Scanner scanI = new Scanner(System.in);
		
		
		
		int choix;
		String cne;
		service serv = new Serviceimpl();
		Add add = new Addimpl();
		
		//
		
		
			
				do
				{
					
				System.out.println(" =============| MENU |============== ");	
				System.out.println("    1 --------------> Creer ");	
				System.out.println("    2 --------------> afficher All  edt  ");	
				System.out.println("    3 --------------> Afficher etd ");	
				System.out.println("    4 --------------> Modifier etd ");	
				System.out.println("    5 --------------> find_etd ");
				System.out.println("    6 --------------> trier list des etds  par leur CNE ");	
				System.out.println("    7 --------------> Supperimer etd ");	
				System.out.println("    8 --------------> Stocker ");	
				System.out.println("    9 --------------> Charger ");	
				System.out.println("    0 --------------> Quitter");
				
				choix = scanI.nextInt();
				AtomicInteger a = new AtomicInteger();
					switch (choix) {
					case 1: 
							Etd e = new Etd();
							e.setCount(a);
							serv.Creer(scanI, scanS, e);							
							add.ajoute(e);
						break;
						
					case 2: 
						
						     serv.Afficherall();
						
						break;
						
					case 3:
							
							scanS.nextLine();
							System.out.println(" donnez CNE de l etudiant a afficher ");
							cne =  scanS.nextLine();
							serv.Afficher(cne);
						break;
					case 4:
							scanS.nextLine();
							System.out.println(" donnez CNE de l etudiant a Modifier ");
							cne = scanS.nextLine();
							serv.Modifier(cne);
												
						break;
					case 5:
												
						System.out.println(" donner  CNE : ");
						cne = scanS.next();						
						serv.Afficher(cne);
							
						break;
					case 6:
						
						serv.trier();
						
						break;
					case 7:
						scanS.nextLine();
						System.out.println(" donnez CNE de l etudiant a supprimer ");
						cne = scanS.nextLine();
						serv.supprimer(cne);
						break;
					case 8:
						add.Stocker();
						break;
					case 9:						 
						add.Chager();
						break;
																						
					case 0:
							System.out.println(" closing  ");
								
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + choix);
					}
	
				}while( choix != 0 );
		
	}

}
