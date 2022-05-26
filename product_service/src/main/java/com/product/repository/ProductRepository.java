package com.product.repository;
import java.util.List;
import java.util.Optional;
import com.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

	Optional <Product> findByProductName(String ProductName);
	List<Product> findByCategory(String category);

	List<Product> findByProductType(String productType);
}
