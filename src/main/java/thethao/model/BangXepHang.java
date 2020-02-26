package thethao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xephang")
public class BangXepHang extends ClassChung{

	private String ten;
	private Number sotran;
	private Number thang;
	private Number hoa;
	private Number bai;
	private Number sobanthang;
	private Number diem;

	public String ten() {
		return ten;
	}

	public Number getSotran() {
		return sotran;
	}

	public Number getThang() {
		return thang;
	}

	public Number getHoa() {
		return hoa;
	}
	public Number getBai() {
		return bai;
	}
	public Number getSobanthang() {
		return sobanthang;
	}
	public Number getDiem() {
		return diem;
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
