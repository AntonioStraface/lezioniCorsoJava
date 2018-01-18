package lezioni.polimorfismo.override;

class PuntoTridimensionale extends Punto {
	private int z;
	
	@Override
	public String toString() {
		return "x:" + getX() + " y:" +getY() + " z:" +getZ();
		
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public double distanzaDallOrigine() {
		return Math.sqrt((getX() + getX()) + (getY() + getY()) + (z + z));
	}
	
}

