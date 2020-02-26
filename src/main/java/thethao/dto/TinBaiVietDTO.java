package thethao.dto;

import java.util.Date;

import thethao.model.TheLoaiBaiViet;

public class TinBaiVietDTO {
	
	
	private String hinh;

	private String tieude;

	private Date ngay;

	private String mota;

	private String code ;
	
	public String getCode() {
		return code ;
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
