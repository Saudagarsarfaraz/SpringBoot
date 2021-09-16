package in.synerzip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.synerzip.entity.Account;
import in.synerzip.entity.AccountPk;

@Repository
public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
