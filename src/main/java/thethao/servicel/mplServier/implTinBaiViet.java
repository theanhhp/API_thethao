package thethao.servicel.mplServier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thethao.Repository.TheLoaiBaiVietRepository;
import thethao.Repository.TinBaiVietRepository;
import thethao.converter.BaiTinConverter;
import thethao.dto.TinBaiVietDTO;
import thethao.model.TheLoaiBaiViet;
import thethao.model.TinBaiViet;
import thethao.servicel.ServiceTinBaiViet;

@Service
public class implTinBaiViet implements ServiceTinBaiViet {
	@Autowired
	private TheLoaiBaiVietRepository theloai;
	@Autowired
	private TinBaiVietRepository baiviet;
	@Autowired
	private BaiTinConverter converter;

	@Override
	public TinBaiVietDTO save(TinBaiVietDTO tinBaiVietDTO) {
		TheLoaiBaiViet loaiBaiViet = theloai.findoneBycode(tinBaiVietDTO.getCode());
		TinBaiViet modeltinBaiViet = converter.tomodex(tinBaiVietDTO);
		modeltinBaiViet.setTheloai(loaiBaiViet);
		modeltinBaiViet = baiviet.save(modeltinBaiViet);
		return converter.toDTO(modeltinBaiViet);

	}
}
