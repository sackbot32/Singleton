
public class Humano {
	 
	private String nombre;
	private int edad;
	private static Humano humano;
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static Humano getInstance() {
		if(humano == null) {
			humano = new Humano();
			humano.setEdad(20);
			humano.setNombre("Alberto");
			}
			return humano;
	}
	
	
	

}
