package mundial;

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
		if ( this.getPg() == 1) {
			pts+=3;
		}
		else if( this.getPe() == 1) {
			pts++;
		}
	}
	
	public int getPj() {
		return pj;
	}
	public void setPj(int pj) {
		this.pj += pj;
	}
	public int getPg() {
		return pg;
	}
	public void setPg(int pg) {
		this.pg += pg;
	}
	public int getPe() {
		return pe;
	}
	public void setPe(int pe) {
		this.pe += pe;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp += pp;
	}
	public int getGf() {
		return gf;
	}
	public void setGf(int gf) {
		this.gf += gf;
	}
	public int getGc() {
		return gc;
	}
	public void setGc(int gc) {
		this.gc += gc;
	}
	public int getGd() {
		return gd;
	}
	public void setGd() {
		this.gd = (this.gf - this.gc);
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts += pts;
	}
	
}
