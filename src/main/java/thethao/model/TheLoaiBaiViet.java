package thethao.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaitinbongda")
public class TheLoaiBaiViet extends ClassChung {
   
	
	private String tenloaitin;
	private String mota;
	
	@OneToMany(mappedBy = "theloai")
	private List<TinBaiViet> news = new ArrayList<>();
	
	public String getTenloaitin() {
		return tenloaitin;
	}
	public void setTenloaitin(String tenloaitin) {
		this.tenloaitin = tenloaitin;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
