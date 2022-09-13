package worldCup;

import java.util.ArrayList;
import java.util.Calendar;

public class PlayOff {
	
	ArrayList<Partido> partidosPlayOff;
	int fasePlayOff;
	
	public PlayOff(ArrayList<Estadio> sede) {
		
		Calendar fecha = Calendar.getInstance();
		
		//OCTAVOS DE FINAL 
		// OCTAVOS A1 VS B2
		fecha.set(2022, 11, 3, 18, 0);
		Partido match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
 		fecha.set(2022, 11, 3, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
 		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
 		fecha.set(2022, 11, 3, 18, 0);
		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
 		fecha.set(2022, 11, 3, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// OCTAVOS A1 VS B2
 		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// CUARTOS DE FINAL 
 		// CUARTOS A1 VS B2
 		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// CUARTOS A1 VS B2
 		fecha.set(2022, 11, 4, 18, 0);
 		match = new Partido (fecha,sede.get(0));
 		partidosPlayOff.add(match);
 		
 		// CUARTOS A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
 	 	
 	 	// CUARTOS A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
 	 	
 	 	// SEMIFINAL 
 	 	// SEMI A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
 	 		
 	 	// SEMI A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
 	 	
 	 	// TERCER/CUARTO PUESTO
 	 	// 3er/4to A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
 	 	
 	 	// FINAL FIFA WORLD CUP
 	 	// FINAL A1 VS B2
 	 	fecha.set(2022, 11, 4, 18, 0);
 	 	match = new Partido (fecha,sede.get(0));
 	 	partidosPlayOff.add(match);
	}
	
	
	

}
