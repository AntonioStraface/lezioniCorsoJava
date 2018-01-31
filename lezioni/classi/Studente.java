package lezioni.classi;

import java.util.regex.Pattern;

public class Studente extends Persona{
  private String titoloStudio;
  int matricola;
  private static final String REGEX="\\d{1,7}";
  
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
  
  private boolean checkMatricola(String mat) {
	  return (Pattern.matches(REGEX, mat));
  }
  
  public void setMatricola(int m) {
	  if (checkMatricola(Integer.toString(m))) matricola=m;
	  else matricola=-1;
  }
  
  public int getMatricola() {
	  return matricola;
  }
  
  public String getTitoloStudio() {
	  return titoloStudio;
  }
}


