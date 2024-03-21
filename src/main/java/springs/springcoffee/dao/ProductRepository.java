package springs.springcoffee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.springcoffee.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Long> {

    @Override
    List<Product> findAll();
}
