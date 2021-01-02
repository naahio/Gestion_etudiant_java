package entities;


import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Etd implements Comparable<Etd>, Serializable {


	static private int idGen;
	private int Id;
	private String nom;
	private String prenom;
	private String CNE;
	private String CIN;
	private float moy;
	public  AtomicInteger count = new AtomicInteger(0); 
	

	public Etd() {
		
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCNE() {
		return CNE;
	}


	public void setCNE(String cNE) {
		CNE = cNE;
	}


	public String getCIN() {
		return CIN;
	}


	public void setCIN(String cIN) {
		CIN = cIN;
	}


	public  AtomicInteger getCount() {
		return count;
	}
	
	public  void setCount(AtomicInteger Count ) {
		 count = Count;
	}

	

	public  void setCount( ) {
		this.idGen++;
		this.Id = this.idGen;
	}

	public float getMoy() {
		return moy;
	}


	public void setMoy(float moy) {
		this.moy = moy;
	}


	@Override
	public int compareTo(Etd o) {
		if( this.CNE.compareTo(o.getCNE()) == 0 )
			return 0;
		else if( this.CNE.compareTo(o.getCNE()) > 0 )
		 return 1;
		else 
		return -1;
	}
	
	
}
