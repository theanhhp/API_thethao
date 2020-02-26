package thethao.model;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class ClassChung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreatedDate
	private Date ngaytao;
	@LastModifiedDate
	private Date ngaysua;
	@CreatedBy
	private String aitao;
	@LastModifiedBy
	private String aisua;

	public Long getId() {
		return id;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public Date getNgaysua() {
		return ngaysua;
	}

	public String getAitao() {
		return aitao;
	}

	public String getAisua() {
		return aisua;
	}

}
