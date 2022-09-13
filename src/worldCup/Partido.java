package worldCup;

import java.util.Calendar;

public class Partido {
	
	private Calendar fecha;
	private Estadio estadio;
	private Equipo equipoA;
	private Equipo equipoB;
	private int golesEquipoA;
	private int golesEquipoB;
	private boolean jugado;
	//private Referi referi;
	//private Referi asistenteReferi;
	//private Referi asistenteVideo;
	private int idPartido;
	
	
	public Partido(Equipo equipo1, Equipo equipo2) {
		
		setEquipoA(equipo1);
		setEquipoB(equipo2);
	}
	
	public Partido (Calendar fechaDesignada, Estadio estadioDesignado) {
		this.setEstadio(estadioDesignado);
		this.fecha = fechaDesignada;
	}
	
	public void simularPartido (int g1, int g2) {
		this.setGolesEquipoA(g1);
		this.setGolesEquipoB(g2);
		this.setJugado(true);
		
		System.out.println("\t\t\t  " + this.getEquipoA().getPais() + "  " + this.getGolesEquipoA() + "  vs  " + this.getGolesEquipoB() + " " + this.getEquipoB().getPais());

		
		if (g1 > g2) 
		{
			this.equipoA.sumaEstadisticas(1,1,0,0,g1,g2);
			this.equipoB.sumaEstadisticas(1,0,0,1,g2,g1);
		}
		else if (g2 > g1) 
		{
			this.equipoA.sumaEstadisticas(1,0,0,1,g1,g2);
			this.equipoB.sumaEstadisticas(1,1,0,0,g2,g1);
		}
		else 
		{
			this.equipoA.sumaEstadisticas(1,0,1,0,g1,g2);
			this.equipoB.sumaEstadisticas(1,0,1,0,g1,g2);
		}
				
	}
	
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public int getGolesEquipoA() {
		return golesEquipoA;
	}
	public void setGolesEquipoA(int golesEquipoA) {
		this.golesEquipoA = golesEquipoA;
	}
	public int getGolesEquipoB() {
		return golesEquipoB;
	}
	public void setGolesEquipoB(int golesEquipoB) {
		this.golesEquipoB = golesEquipoB;
	}
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public boolean isJugado() {
		return jugado;
	}
	public void setJugado(boolean jugado) {
		this.jugado = jugado;
	}

	public Equipo getEquipoA() {
		return equipoA;
	}

	public void setEquipoA(Equipo equipo1) {
		this.equipoA = equipo1;
	}

	public Equipo getEquipoB() {
		return equipoB;
	}

	public void setEquipoB(Equipo equipo2) {
		this.equipoB = equipo2;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
}
