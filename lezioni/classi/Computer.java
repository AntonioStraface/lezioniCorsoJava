package lezioni.classi;

public class Computer {
	 
	 private String marca, produttore, negozio;
	 private int costo, ram;

	public Computer(String marca, String produttore, String negozio, int costo,
			int ram) {
		this.setMarca(marca);
		this.setProduttore(produttore);
		this.setCosto(costo);
		this.setRam(ram);
		this.setNegozio(negozio);
	}
	public Computer(){
		marca="";
		produttore="";
		costo=0;
		ram=0;
		negozio="";
	}
	public String  getMarca(){
		return marca;
	}
	public String getProduttore(){
		return produttore;
	}
	public int  getCosto(){
		return costo;
	}
	public int  getRam(){
		return ram;
	}
	public String  getNegozio(){
		return negozio;
	}
	
	public void setCosto(int costo){
		if (costo>100){
			this.costo = costo;
		}
		
	}
	public void setRam(int ram){
		if (ram > 4){
			this.ram = ram;
		}
	}
	public void setMarca(String marca) {
		if (marca.length()>0)
		{
			this.marca=marca;
		}
	}
	public void setProduttore(String produttore) {
		if (produttore.length()>0)
		{
			this.produttore=produttore;
		}
	}
	public void setNegozio(String negozio) {
		if (negozio.length()>0)
		{
			this.negozio=negozio;
		}
	}
	
	@Override
	public String toString() {
		return "Il computer di marca "+this.marca+"e prodotto da "+this.produttore+" con "+this.ram+" costa "+this.costo+" euro.";
	}
	
	public boolean equals(Computer pc) {
		return (this.marca.equals(pc.getMarca())
				&& this.produttore.equals(pc.getProduttore())
				&& this.ram == pc.getRam()
				&& this.costo == pc.getCosto());
	}
}
