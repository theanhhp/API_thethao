package thethao.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class NhanVien extends ClassChung {
	
	private String ten;
	private Date ngaysinh;
	private String sodienthoai;
	private String email;
	private String diachi;
	private String hinh;
	private Number luong;
	
	@OneToMany(mappedBy = "idemployee") 
	private List<Account> news = new ArrayList<>();
	
	
	
	public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public Date getNgaysinh() {
		return ngaysinh;
	}



	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}



	public String getSodienthoai() {
		return sodienthoai;
	}



	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDiachi() {
		return diachi;
	}



	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}



	public String getHinh() {
		return hinh;
	}



	public void setHinh(String hinh) {
		this.hinh = hinh;
	}



	public Number getLuong() {
		return luong;
	}



	public void setLuong(Number luong) {
		this.luong = luong;
	}



	public List<Account> getNews() {
		return news;
	}



	public void setNews(List<Account> news) {
		this.news = news;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
