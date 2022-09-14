package worldCup;

/**
 * En la clase EstadisticasEquipo se guardan los datos de cada equipo
 * <p>
 * 
 * 
 * @param pj Los partidos jugados se represntan como un int
 * @param pg Los partidos ganados se represntan como un int
 * @param pe Los partidos empatados se represntan como un int
 * @param pp Los partidos perdidos se represntan como un int
 * @param gf Los goles a favor se represntan como un int
 * @param gc Los goles en contra se represntan como un int
 * @param gd La diferencia de goles se represntan como un int
 * @param pts Los puntos se represntan como un int
 * <p>
 *  
 * @version 1.0
 * @author Geronimo
 *
 */

public class EstadisticasEquipo {
	
	private int pj;
	private int pg;
	private int pe;
	private int pp;
	private int gf;
	private int gc;
	private int gd;
	private int pts;
	
	public EstadisticasEquipo(int j, int g, int e, int p, int golesF, int golesC) {
		pj += j;
		pg += g;
		pe += e;
		pp += p;
		gf += golesF;
		gc += golesC;
		gd += (golesF - golesC);
		if ( g == 1) {
			pts+=3;
			
		}
		else if( e == 1) {
			pts++;
		}
	}
	
	public int getPj() {
		/**
		 * @return pj
		 * <p>
		 */
		return pj;
	}
	public void setPj(int pj) {
		this.pj++;
	}
	public int getPg() {
		/**
		 * @return pg
		 * <p>
		 */
		return pg;
	}
	public void setPg(int pg) {
		this.pg += pg;
	}
	public int getPe() {
		/**
		 * @return pe
		 * <p>
		 */
		return pe;
	}
	public void setPe(int pe) {
		this.pe += pe;
	}
	public int getPp() {
		/**
		 * @return pp
		 * <p>
		 */
		return pp;
	}
	public void setPp(int pp) {
		this.pp += pp;
	}
	public int getGf() {
		/**
		 * @return gf
		 * <p>
		 */
		return gf;
	}
	public void setGf(int gf) {
		this.gf += gf;
	}
	public int getGc() {
		/**
		 * @return gc
		 * <p>
		 */
		return gc;
	}
	public void setGc(int gc) {
		this.gc += gc;
	}
	public int getGd() {
		/**
		 * @return gd
		 * <p>
		 */
		return gd;
	}
	public void setGd() {
		this.gd = (this.gf - this.gc);
	}
	public int getPts() {
		/**
		 * @return pts
		 * <p>
		 */
		return pts;
	}
	public void setPts(int pts) {
		this.pts += pts;
	}
	
}
