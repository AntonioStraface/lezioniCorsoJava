package lezioni.classi;

import java.util.regex.Pattern;

public class Libro {
	public static final String regexAnno = "\\d{4}";
	String autore, titolo;
	int pagine, anno;
	
	public Libro(){
		autore="";
		titolo="";
		pagine=0;
		anno=0;
	}
	
	public  Libro(String nomeautore,String titoloLibro, int nPagine, int annoLibro){
		autore = nomeautore;
		titolo = titoloLibro;
		pagine = nPagine;
		setAnno(annoLibro);
	}
	
	public int getAnno() {
		return anno;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public int getPagine() {
		return pagine;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setAnno(int anno) {
		if (Pattern.matches(regexAnno, Integer.toString(anno))) {
			this.anno = anno;
		}
		
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
}

