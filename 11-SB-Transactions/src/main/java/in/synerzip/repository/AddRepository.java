package in.synerzip.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.synerzip.entity.Address;

public interface AddRepository extends JpaRepository<Address, Serializable> {

}
