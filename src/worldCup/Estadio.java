package worldCup;

/**
 * En la clase Estadio se modela las diferentes sedes que se utilizaran en el mundial
 * <p>
 * 
 * 
 * @param nombre El nombre se representa como String
 * @param ciudad El nombre de la ciudad se representa como String
 * @param capacidad La capacidad del estadio se representa como un int
 * <p>
 *  
 * @version 1.0
 * @author Geronimo
 *
 */

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
		/**
		 * @return nombre
		 * <p>
		 */
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		/**
		 * @return ciudad
		 * <p>
		 */
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCapacidad() {
		/**
		 * @return capacidad
		 * <p>
		 */
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
}
