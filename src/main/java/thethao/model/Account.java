package thethao.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account extends ClassChung{
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn (name = "employeeid")
	private Account idemployee;
	
	
	private Number trangthai;
	
	
	private String username;
	
	
	private String password;
	

	public Account() {
		
	}
	
	public Account getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(Account idemployee) {
		this.idemployee = idemployee;
	}

	public Number getTrangthai() {
		return trangthai;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	

}
