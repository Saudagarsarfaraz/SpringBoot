package in.synerzip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.synerzip.entity.EMP_TBL;

@Repository
public interface EmpRepository extends JpaRepository<EMP_TBL, Long>{

}
