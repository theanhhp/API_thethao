package thethao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cado")
public class Cado extends ClassChung {
	
	private Number VongDau;
	private String SNCA;
	private String TiLe;
	private String SKCA;
	private String SNCAU;
	private String Hoa;
	private String SKCAU;
	
	
	public Number getVongDau() {
		return VongDau;
	}


	public String getSNCA() {
		return SNCA;
	}


	public String getTiLe() {
		return TiLe;
	}


	public String getSKCA() {
		return SKCA;
	}


	public String getSNCAU() {
		return SNCAU;
	}


	public String getHoa() {
		return Hoa;
	}


	public String getSKCAU() {
		return SKCAU;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
