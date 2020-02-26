package thethao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import thethao.model.Account;
public interface AccountRepository extends JpaRepository<Account, Long>{

}
