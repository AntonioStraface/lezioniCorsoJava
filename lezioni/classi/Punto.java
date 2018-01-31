package lezioni.classi;

public class Punto {
	int x; 
	int y;
	int z;
	
	public Punto(int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
	
	public Punto(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+", "+z+")";
	}
	
	@Override
	public boolean equals(Object o)
	{
		Punto p = (Punto) o; // TYPE-CASTING
		
		return (x == p.getX()
				&& y == p.getY()
				&& z == p.getZ());
	}
}
