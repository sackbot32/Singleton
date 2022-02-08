
public class SingletonHumano {
	private static Humano humano;
	
	public static Humano getHumano() {
		if(humano == null) {
		humano = new Humano();
		humano.setEdad(20);
		humano.setNombre("Alberto");
		}
		return humano;
	}
}
