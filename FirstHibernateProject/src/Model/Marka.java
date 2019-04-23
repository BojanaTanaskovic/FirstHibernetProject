package Model;

import javax.persistence.Entity;

@Entity
public class Marka {

	
	private int idMarke;
	private String nayivMarke;
	private String zemlja;
	public int getIdMarke() {
		return idMarke;
	}
	public void setIdMarke(int idMarke) {
		this.idMarke = idMarke;
	}
	public String getNayivMarke() {
		return nayivMarke;
	}
	public void setNayivMarke(String nayivMarke) {
		this.nayivMarke = nayivMarke;
	}
	public String getZemlja() {
		return zemlja;
	}
	public void setZemlja(String zemlja) {
		this.zemlja = zemlja;
	}
	
	
	
	
	
	
	
}
