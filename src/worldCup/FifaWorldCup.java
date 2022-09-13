package worldCup;

import java.util.ArrayList;

public class FifaWorldCup {
	
	ArrayList<Grupo> grupos;
	PlayOff playOff;
	ArrayList<Estadio> sedes;
	
	public FifaWorldCup() {
		
		//Cargamos las sedes donde se van a realizar las competencias
		this.sedes = cargaSedes();
		//Asignamos fechas y sedes a los PlayOffs
		playOff = new PlayOff(sedes);
		//Luego del sorteo, agrupamos los equipos y generamos el cronograma de los respectivos partidos
		this.generarGrupos();
		
	}
	
	private void generarGrupos() {
		
	}
	
	
	
	private ArrayList<Estadio> cargaSedes(){
		
		ArrayList<Estadio> aux = new ArrayList<Estadio>();
		
		Estadio auxEstadio = new Estadio("Lusail Iconic Stadium","Lusail",80000);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Al Bayt Stadium","Lusail",60000);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Stadium 974","Doha",40000);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Al Thumama Stadium","Doha",40000);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Al Bayt Stadium","Al Rayyan",45416);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Education City Stadium","Al Rayyan",45350);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Ahmad bin Ali Stadium","Al Wakrah",44740);
		aux.add(auxEstadio);
		auxEstadio = new Estadio("Al Janoub Stadium","Al Wakrah",40000);
		aux.add(auxEstadio);
		
		return aux;
	}

	public ArrayList<Estadio> getSedes() {
		return sedes;
	}

	public void setSedes(ArrayList<Estadio> sedes) {
		this.sedes = sedes;
	}
	
	
	
}
