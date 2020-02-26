package thethao.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name = "tinbongda")
public class TinBaiViet extends ClassChung {
	
	private String hinh;
	
	private String tieude;
	
	private Date ngay;
	
	private String mota;
	
	private String code ;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name ="idloaitin")
	private TheLoaiBaiViet theloai;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public TheLoaiBaiViet getTheloai() {
		return theloai;
	}
	public void setTheloai(TheLoaiBaiViet theloai) {
		this.theloai = theloai;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
}
