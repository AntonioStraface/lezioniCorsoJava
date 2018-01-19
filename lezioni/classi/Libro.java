package lezioni.classi;

public class Libro {
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
		anno = annoLibro;
	}
}

