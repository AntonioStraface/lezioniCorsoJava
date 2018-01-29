package lezioni.classi;

public class Computer {
	 private String marca, produttore;
	 private int costo, ram;

	public Computer(String nomemarca, String nomeproduttore, int costopc,
			int nram) {
		marca=nomemarca;
		produttore=nomeproduttore;
		costo=costopc;
		ram=nram;
	}
	public Computer(){
		marca="";
		produttore="";
		costo=0;
		ram=0;
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
	
	public void setCosto(int c ){
		if (c>100){
			costo = c;
			
		}
		
	}
  
	public void setRam(int r){
		if (r > 4){
			ram = r;
		}
		
	}
	
}
