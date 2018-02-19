package eserciziduranteilcorso.collezionista.model;

public abstract class Supporto {
	private TipiSupporto tipoSupporto;
	private Media m;
	
	public Supporto(Media m, TipiSupporto supporto) {
		setM(m);
		setTipoSupporto(supporto);
	}
	
	public void setM(Media m) {
		this.m = m;
	}
	
	
	public Media getM() {
		return m;
	}
	
	public void setTipoSupporto(TipiSupporto tipoSupporto) {
		this.tipoSupporto = tipoSupporto;
	}
	
	public TipiSupporto getTipoSupporto() {
		return tipoSupporto;
	}
	
	@Override
	public String toString() {
		return "SUPPORTO: "+tipoSupporto+m.toString();
	}
	
}
