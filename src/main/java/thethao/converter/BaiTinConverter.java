package thethao.converter;

import org.springframework.stereotype.Component;

import thethao.dto.TinBaiVietDTO;
import thethao.model.TinBaiViet;

@Component
public class BaiTinConverter {

	public TinBaiViet tomodex(TinBaiVietDTO dto) {
		TinBaiViet model = new TinBaiViet();
		model.setTieude(dto.getTieude());
		model.setNgay(dto.getNgay());
		model.setMota(dto.getMota());
		model.setHinh(dto.getHinh());
		return model;

	}

	public TinBaiVietDTO toDTO(TinBaiViet model) {
		TinBaiVietDTO dto = new TinBaiVietDTO();
		dto.setTieude(model.getTieude());
		dto.setNgay(model.getNgay());
		dto.setMota(model.getMota());
		dto.setHinh(model.getHinh());
		return dto;

	}
}
