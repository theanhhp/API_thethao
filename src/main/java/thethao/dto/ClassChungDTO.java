package thethao.dto;

import java.util.Date;



public abstract class ClassChungDTO  {

	private Long id;
	private Date ngaytao;
	private Date ngaysua;
    private String aitao;
    private String aisua;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	public Date getNgaysua() {
		return ngaysua;
	}
	public void setNgaysua(Date ngaysua) {
		this.ngaysua = ngaysua;
	}
	public String getAitao() {
		return aitao;
	}
	public void setAitao(String aitao) {
		this.aitao = aitao;
	}
	public String getAisua() {
		return aisua;
	}
	public void setAisua(String aisua) {
		this.aisua = aisua;
	}
    
}
