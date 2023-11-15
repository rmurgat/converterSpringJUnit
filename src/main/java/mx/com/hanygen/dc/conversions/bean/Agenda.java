package mx.com.hanygen.dc.conversions.bean;

public class Agenda {
	
	private int cdAgenda;
	private String stAgenda;
	private String stShortCut;
	private String cdUsuario;
	private String nbShortImage;
	private String nbAgenda;
	private String txComment;
	
	public int getCdAgenda() {
		return cdAgenda;
	}
	public void setCdAgenda(int cdAgenda) {
		this.cdAgenda = cdAgenda;
	}
	public String getStAgenda() {
		return stAgenda;
	}
	public void setStAgenda(String stAgenda) {
		this.stAgenda = stAgenda;
	}
	public String getStShortCut() {
		return stShortCut;
	}
	public void setStShortCut(String stShortCut) {
		this.stShortCut = stShortCut;
	}
	public String getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario;
	}
	public String getNbShortImage() {
		return nbShortImage;
	}
	public void setNbShortImage(String nbShortImage) {
		this.nbShortImage = nbShortImage;
	}
	public String getNbAgenda() {
		return nbAgenda;
	}
	public void setNbAgenda(String nbAgenda) {
		this.nbAgenda = nbAgenda;
	}
	public String getTxComment() {
		return txComment;
	}
	public void setTxComment(String txComment) {
		this.txComment = txComment;
	}
	
	@Override
	public String toString() {
		return "Agenda [cdAgenda=" + cdAgenda + ", stAgenda=" + stAgenda + ", stShortCut=" + stShortCut + ", cdUsuario="
				+ cdUsuario + ", nbShortImage=" + nbShortImage + ", nbAgenda=" + nbAgenda + ", txComment=" + txComment
				+ "]";
	}
	
}
