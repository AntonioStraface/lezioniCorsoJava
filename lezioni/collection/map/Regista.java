package lezioni.collection.map;

import java.util.LinkedList;

class Regista {

	private String nome;
	private LinkedList<Film> filmografia;
	
	public void addFilm(Film f) {
		filmografia.add(f);
	}
	
	public Film ultimoFilm() {
		return this.getFilmografia().getLast();
	}
	
	public Regista(String nome) {
		filmografia = new LinkedList<Film>();
		this.nome = nome;
	}
	
	public void addFilms(Film...Films) {
		for(Film f: Films) {
			filmografia.add(f);
		}
	}
	
	public LinkedList<Film> getFilmografia() {
		return filmografia;
	}
	
	public void setFilmografia(LinkedList<Film> filmografia) {
		this.filmografia = filmografia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
