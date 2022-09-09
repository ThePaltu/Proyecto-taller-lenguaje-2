package mundial;

import java.util.ArrayList;

public class Test {
												
	public static void main(String[] args) {
		
		// Conformacion de GRUPO A
		Equipo catar = new Equipo("Catar");
		Equipo ecuador = new Equipo("Ecuador");
		Equipo senegal = new Equipo("Senegal");
		Equipo paisesBajos = new Equipo("Paises Bajos");
		
		ArrayList<Equipo> grupoAequipos = new ArrayList<Equipo>();
		
		grupoAequipos.add(catar);
		grupoAequipos.add(ecuador);
		grupoAequipos.add(senegal);
		grupoAequipos.add(paisesBajos);
		
		Grupo grupoA = new Grupo('A',grupoAequipos);
		
		grupoA.getPartidosGrupo().get(0).simularPartido(1, 2);
		grupoA.getPartidosGrupo().get(1).simularPartido(1, 1);
		
		grupoA.getPartidosGrupo().get(2).simularPartido(2, 0);
		grupoA.getPartidosGrupo().get(3).simularPartido(0, 1);
		
		grupoA.getPartidosGrupo().get(4).simularPartido(2, 2);
		grupoA.getPartidosGrupo().get(5).simularPartido(2, 0);
		
		grupoA.mostrarTablasGrupo();
		
		

	}

}
