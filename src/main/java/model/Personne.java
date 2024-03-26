package model;

public class Personne {

	
	private int id;
	private String prenom;
	private String famille;
	private String lieuDeNaissance;
	private int age;
	private Boolean sexe;
	
	
	public Personne() {
		super();
	}

	

	public Personne(String prenom, String famille) {
		super();
		this.prenom = prenom;
		this.famille = famille;
	}



	public Personne(int id, String prenom, String famille, String lieuDeNaissance, int age, Boolean sexe) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.famille = famille;
		this.lieuDeNaissance = lieuDeNaissance;
		this.age = age;
		this.sexe = sexe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getFamille() {
		return famille;
	}


	public void setFamille(String famille) {
		this.famille = famille;
	}


	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}


	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Boolean getSexe() {
		return sexe;
	}


	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}
	
	
	
	
	
	
}
