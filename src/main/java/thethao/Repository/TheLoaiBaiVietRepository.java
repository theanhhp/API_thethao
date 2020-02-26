package thethao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thethao.model.TheLoaiBaiViet;

public interface TheLoaiBaiVietRepository extends JpaRepository<TheLoaiBaiViet, Long> {
     TheLoaiBaiViet findoneBycode (String code);
}
