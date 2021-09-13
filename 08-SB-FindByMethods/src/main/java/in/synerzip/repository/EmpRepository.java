package in.synerzip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import in.synerzip.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{
	
	public Employee findByEmpName(String name);
	
	public Employee findByEmpSal(Long sal);
	
	public List<Employee> findByEmpNameAndEmpSal(String name , long Sal);
	
	public List<Employee> findByEmpSalGreaterThan(long Sal);

	public List<Employee> findByEmpNameIn(List<String> names);

	@Query("Select empSal from Employee where empName=:name")
	public Long findEmpSalByEmpName(String name);

	@Query(value = "Select count(*) from EMP_TBL", nativeQuery = true)
	public Integer getCount() ;
		
	
	
	
}
