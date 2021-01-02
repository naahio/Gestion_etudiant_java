package entities;

public class Filiere {

	
	private String Nom;
	private String depart;
	private String num_module;
	private String Semestre;
	
	
	
	public Filiere()
			{
			
			}



	public String getNom() {
		return Nom;
	}



	public void setNom(String nom) {
		Nom = nom;
	}



	public String getDepart() {
		return depart;
	}



	public void setDepart(String depart) {
		this.depart = depart;
	}



	public String getNum_module() {
		return num_module;
	}



	public void setNum_module(String num_module) {
		this.num_module = num_module;
	}



	public String getSemestre() {
		return Semestre;
	}



	public void setSemestre(String semestre) {
		Semestre = semestre;
	}
			
	
		
	
}
