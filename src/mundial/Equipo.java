package mundial;

//import java.util.ArrayList;

public class Equipo {
	
	private String pais;
	private EstadisticasEquipo estadistica;
	//private ArrayList<Jugador> jugadores;
	//private ArrayList<Auxiliar> auxiliares;
	//private Auxiliar directorTecnico;
	private int finalesPrevias;
	private String confederacion;
	
	
	public Equipo(String nombre) {
		this.setPais(nombre);
		estadistica = new EstadisticasEquipo(0,0,0,0,0,0);
	}
	
	public void sumaEstadisticas(int j, int g, int e, int p, int golesF, int golesC) {
		this.estadistica.setPj(j);
		this.estadistica.setPg(g);
		this.estadistica.setPe(e);
		this.estadistica.setPp(p);
		this.estadistica.setGf(golesF);
		this.estadistica.setGc(golesC);
		this.estadistica.setGd();
		if ( estadistica.getGf() == 1) {
			this.estadistica.setPts(3);
		}
		else if( estadistica.getGd() == 1) {
			this.estadistica.setPts(1);
		}
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getFinalesPrevias() {
		return finalesPrevias;
	}
	public void setFinalesPrevias(int finalesPrevias) {
		this.finalesPrevias = finalesPrevias;
	}
	public String getConfederacion() {
		return confederacion;
	}
	public void setConfederacion(String confederacion) {
		this.confederacion = confederacion;
	}

	public EstadisticasEquipo getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(EstadisticasEquipo estadistica) {
		this.estadistica = estadistica;
	}

}
