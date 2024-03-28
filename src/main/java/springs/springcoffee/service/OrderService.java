package springs.springcoffee.service;

import springs.springcoffee.dto.AddItemRequest;

/**
 * @author max.gun
 * @since 28/03/2024
 */
public interface OrderService {
    Long openOrder();

    void addItemToOrder(AddItemRequest addItemRequest);
}
