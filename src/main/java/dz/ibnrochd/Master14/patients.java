package dz.ibnrochd.Master14;
import org.springframework.data.annotation.*;


public class patients {
	
	@Id
    private String id;
	private String nom,prenom;
	private String date;
    private String sexe;
	public patients(String id, String nom, String prenom, String date, String sexe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.sexe = sexe;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
} 