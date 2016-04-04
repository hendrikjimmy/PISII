package poligono;

public class Linea {
	private int n, x;
	
	public Linea (int m, Punto punto){
		x = m;
		n = m*punto.getPosX() + punto.getPosY();
	}
	
	public String toString(){
		return "y = "+x+"x + ("+n+")";
	}
	
	public String implicita(){
		return x+"x - y ("+n+") = 0";
	}

}
