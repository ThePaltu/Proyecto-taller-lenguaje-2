package worldCup;

public class Estadio {
	
	private String nombre;
	private String ciudad;
	private int capacidad;
	
	
	
	public Estadio(String nom, String ciudad, int cap) {
		this.nombre = nom;
		this.ciudad = ciudad;
		this.capacidad = cap;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
}
