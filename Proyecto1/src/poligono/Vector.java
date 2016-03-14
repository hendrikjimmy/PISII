package poligono;

public class Vector {

	Punto punto1;
	Punto punto2;
	
	
	public Vector(Punto punto1,Punto punto2){
		this.punto1=punto1;
		this.punto2=punto2;
	}
	
	public int productoVectorial(Vector vector1,Vector vector2){
		
		
		
		return 0;
	}
	
	public String toString(){
		return "y="+(punto2.getPosX()-punto1.getPosX())+"x+"+(punto2.getPosY()-punto1.getPosY());
	}
}
