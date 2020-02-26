package thethao.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import thethao.dto.TinBaiVietDTO;
import thethao.servicel.ServiceTinBaiViet;

@CrossOrigin
@RestController
public class ApiTinBaiViet {
	@Autowired
	private ServiceTinBaiViet ServiceTinBaiViet;
	
	
	@PostMapping(value = "/baiviet")
	public TinBaiVietDTO CreateBaiViet(@RequestBody TinBaiVietDTO model) {
		return ServiceTinBaiViet.save(model);
	}

}
