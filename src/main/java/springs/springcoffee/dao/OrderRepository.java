package springs.springcoffee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springs.springcoffee.entities.Order;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
