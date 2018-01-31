package lezioni.classi;

public class Studente extends Persona{
  private String titoloStudio;
  
  public Studente(String nome, String cognome, int eta, String indirizzo) {
	  super(nome, cognome, eta, indirizzo);
	  setTitoloStudio(); 
  }
  
  private void setTitoloStudio() {
	  if (getEta()> 3 && getEta()< 6) {
		  this.titoloStudio = "materna";
	  }
	  else if (getEta()>= 6 && getEta()< 11) {
		  this.titoloStudio = "elementari";
	  }
	  else if (getEta()>= 11 && getEta()< 14) {
		  this.titoloStudio = "medie";
	  }
	  else if (getEta()>= 14 && getEta()< 19) {
		  this.titoloStudio = "superiori";
	  }
	  else {
		  this.titoloStudio = "altro";
	  }
	
  }
  
  
  public String getTitoloStudio() {
	  return titoloStudio;
  }
}


