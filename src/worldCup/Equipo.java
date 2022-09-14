package worldCup;

/**
 * En la clase Equipo se modela los aspectos de cada seleccion clasificada al mundial
 * <p>
 * 
 * 
 * @param pais El nombre del pais se representa como String
 * @param estadistica Las estadisticas se representar a traves de la clase EstadisticasEquipo
 * @param jugadores Jugadores es un ArrayList que contienen Jugador que representan la plantilla 
 * @param auxiliares Auxiliares es un ArrayList que contiene Auxiliar que representan el cuerpo tecnico
 * @param participacionMundial participacionMundial se representa como String, la mejor participacion de la seleccion en un mundial
 * @param confederacion Es la institucion continetal al que representa la seleccion representada como String
 * <p>
 *  
 * @version 1.0
 * @author Geronimo
 *
 */

//import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {
	
	private String pais;
	private EstadisticasEquipo estadistica;
	//private ArrayList<Jugador> jugadores;
	//private ArrayList<Auxiliar> auxiliares;
	private String participacionMundial;
	private String confederacion;
	
	
	public Equipo(String nombre) {
		this.pais = nombre;
		estadistica = new EstadisticasEquipo(0,0,0,0,0,0);
		/*this.setparticipacionMundial(participacion);
		this.setConfederacion(confe);*/
	}
	
	public void sumaEstadisticas(int j, int g, int e, int p, int golesF, int golesC) {
		this.estadistica.setPj(j);
		this.estadistica.setPg(g);
		this.estadistica.setPe(e);
		this.estadistica.setPp(p);
		this.estadistica.setGf(golesF);
		this.estadistica.setGc(golesC);
		this.estadistica.setGd();
		if ( g == 1) {
			this.estadistica.setPts(3);
		}
		else if( e == 1) {
			this.estadistica.setPts(1);
		}
	}
	
	public String getPais() {
		/**
		 * @return pais
		 * <p>
		 */
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getParticipacionMundial() {
		/**
		 * @return participacionMundial
		 * <p>
		 */
		return participacionMundial;
	}
	public void setParticipacionMundial(String participacionMundial) {
		this.participacionMundial = participacionMundial;
	}
	public String getConfederacion() {
		/**
		 * @return confederacion
		 * <p>
		 */
		return confederacion;
	}
	public void setConfederacion(String confederacion) {
		this.confederacion = confederacion;
	}

	public EstadisticasEquipo getEstadistica() {
		/**
		 * @return estadistica
		 * <p>
		 */
		return estadistica;
	}

	public void setEstadistica(EstadisticasEquipo estadistica) {
		this.estadistica = estadistica;
	}

	@Override
	public int compareTo(Equipo e) {
		 Integer a = this.estadistica.getPts();
		 Integer b = e.estadistica.getPts();
		        
		    if (b.compareTo(a) == 0) {
		            
		        Integer x = this.estadistica.getGd();
		        Integer y = e.estadistica.getGd();
		            
		        if(y.compareTo(x) == 0) {
		    
		            Integer z = this.estadistica.getGf();
		            Integer w = e.estadistica.getGf();
		                
		            return w.compareTo(z); 
		        }else
		            return y.compareTo(x);
		    }

		    return b.compareTo(a);
	}

}
