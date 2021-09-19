package in.synerzip.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.synerzip.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable> {

}
