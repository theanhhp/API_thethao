package thethao.servicel.mplServier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thethao.Repository.TheLoaiBaiVietRepository;
import thethao.dto.TheloaibaivietDTO;
import thethao.servicel.ServiceTheLoaiBaiViet;

@Service
public class implTheLoaiBaiViet implements ServiceTheLoaiBaiViet {
   @Autowired
   private TheLoaiBaiVietRepository repository ;

   @Override
	public TheloaibaivietDTO save(TheloaibaivietDTO TheloaibaivietDTO) {
		// TODO Auto-generated method stub
		return null;
	}
   
}
