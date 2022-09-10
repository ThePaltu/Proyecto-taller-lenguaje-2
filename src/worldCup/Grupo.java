package worldCup;

import java.util.ArrayList;
import java.util.Collections;


public class Grupo {
	
	// Los 4 equipos que participan en el grupo
	private ArrayList<Equipo> equipos;
	
	// Identificador de grupo
	private char idGrupo;
	
	// Los 6 partidos del grupo
	private ArrayList<Partido> partidosGrupo;
	
	// Jornadas jugadas
	private int jornadaActual;
	
	
	
	public Grupo (char id, ArrayList<Equipo> equiposGrupo) {
		
		// Set de identificador de grupo
		this.setIdGrupo(id);
		
		// Se cargan los equipos del grupo
		equipos = new ArrayList<Equipo>();
		for (int i = 0 ; i < 4 ; i++) {
			equipos.add(equiposGrupo.get(i));
		}
		
		// Genera las jornadas del grupo
		this.generadorDePartidos();
		this.mostrarPartidosGrupo();
		
		// Mostrar tabla inicial del grupo
		this.mostrarTablasGrupo();
		
	}
	
	private void generadorDePartidos() {
		
		this.setJornadaActual(0);
		partidosGrupo = new ArrayList<Partido>();
		
		// Jornada 1
		Partido p1 = new Partido(equipos.get(0),equipos.get(1));
		Partido p2 = new Partido(equipos.get(2),equipos.get(3));
		partidosGrupo.add(p1);
		p1.setJugado(false);
		partidosGrupo.add(p2);
		p2.setJugado(false);
		
		// Jornada 2
		Partido p3 = new Partido(equipos.get(0),equipos.get(2));
		Partido p4 = new Partido(equipos.get(3),equipos.get(1));
		partidosGrupo.add(p3);
		p3.setJugado(false);
		partidosGrupo.add(p4);
		p4.setJugado(false);
		
		// Jornada 2
		Partido p5 = new Partido(equipos.get(1),equipos.get(2));
		Partido p6 = new Partido(equipos.get(3),equipos.get(0));
		partidosGrupo.add(p5);
		p5.setJugado(false);
		partidosGrupo.add(p6);
		p6.setJugado(false);	
	}
	
	// Genera una copia de la lista de equipos, la cual contiene las estadisticas, las ordena a traves del Sort en order decreciente y la muestra en pantalla
	public void mostrarTablasGrupo() {
		
		ArrayList<Equipo> copia = this.equipos;
		Collections.sort(copia); 

		System.out.println("-- GRUPO " + this.getIdGrupo() + " ------------------------------------------------------------------------------------------");
		System.out.println("   Seleccion\t\t\t\tPJ\tPG\tPE\tPP\tGF\tGC\tDG\tPts\n-----------------------------------------------------------------------------------------------------");
		
		for (int i = 0 ; i < this.equipos.size() ; i++) {
			System.out.println((i+1) + "  " + copia.get(i).getPais() + "\t\t\t\t " + copia.get(i).getEstadistica().getPj() + "\t " + copia.get(i).getEstadistica().getPg() + "\t " + copia.get(i).getEstadistica().getPe() + "\t " + copia.get(i).getEstadistica().getPp() + "\t " + copia.get(i).getEstadistica().getGf() + "\t " + copia.get(i).getEstadistica().getGc() + "\t " + copia.get(i).getEstadistica().getGd() + "\t " + copia.get(i).getEstadistica().getPts());
		}
		
		
	}
	
	// Muestra los partidos de los 4 equipos, repartidos en las 3 jornadas, ordenado por fecha y horario, detallando el estadio
	public void mostrarPartidosGrupo() {
			
			int i = 0;
			
			System.out.println("---------------------------- GRUPO " + this.getIdGrupo() +" JORNADA " + (i+1) + " ----------------------------");
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i).getEquipoB().getPais());
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i+1).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i+1).getEquipoB().getPais());
			
			i = 2;
			System.out.println("\n\n---------------------------- GRUPO " + this.getIdGrupo() +" JORNADA " + (i) + " ----------------------------");
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i).getEquipoB().getPais());
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i+1).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i+1).getEquipoB().getPais());
			
			i = 4;
			System.out.println("\n\n---------------------------- GRUPO " + this.getIdGrupo() +"JORNADA " + (i-1) + " ----------------------------");
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i).getEquipoB().getPais());
			System.out.println("\t\t\t  " + this.partidosGrupo.get(i+1).getEquipoA().getPais() + " vs " + this.partidosGrupo.get(i+1).getEquipoB().getPais() + "\n\n");

	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public ArrayList<Partido> getPartidosGrupo() {
		return partidosGrupo;
	}

	public void setPartidosGrupo(ArrayList<Partido> partidosGrupo) {
		this.partidosGrupo = partidosGrupo;
	}

	public char getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(char idGrupo) {
		this.idGrupo = idGrupo;
	}

	public int getJornadaActual() {
		return jornadaActual;
	}

	public void setJornadaActual(int jornadaActual) {
		this.jornadaActual = jornadaActual;
	}
	
	

}
