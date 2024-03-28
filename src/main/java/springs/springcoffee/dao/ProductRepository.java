package springs.springcoffee.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.springcoffee.entities.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    List<Product> findAll();

    @Query("SELECT p.supply FROM Product p WHERE p.productName =:productName")
    Integer getSupplyOfProduct(String productName);

    @Query("SELECT p.productName, p.supply FROM Product p")
    List<Object[]> getFullInventory();

    Product findByProductName(String productName);
}
