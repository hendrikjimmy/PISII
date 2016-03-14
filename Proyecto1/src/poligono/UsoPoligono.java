package poligono;

public class UsoPoligono {

	public static void main(String[] args) {
		
		Punto punto1=new Punto(2,3);
		Punto punto2=new Punto(3,5);
		
		Vector vector1=new Vector(punto1,punto2);
		
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(vector1);

	}

}
