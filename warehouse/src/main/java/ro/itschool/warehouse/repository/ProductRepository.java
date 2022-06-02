package ro.itschool.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.warehouse.entitys.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
