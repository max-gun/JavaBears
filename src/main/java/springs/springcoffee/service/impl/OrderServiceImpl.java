package springs.springcoffee.service.impl;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.springcoffee.dao.OrderRepository;
import springs.springcoffee.dao.ProductRepository;
import springs.springcoffee.dto.AddItemRequest;
import springs.springcoffee.entities.Order;
import springs.springcoffee.entities.OrderItem;
import springs.springcoffee.entities.Product;
import springs.springcoffee.service.OrderService;

import java.util.ArrayList;
import java.util.Date;

import static java.util.Objects.nonNull;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Long openOrder() {
        Order order = new Order();
        orderRepository.save(order);
        return order.getOrderId();
    }

    @Override
    public void addItemToOrder(AddItemRequest addItemRequest) {
        Order order = orderRepository.findById(addItemRequest.getOrderId()).orElse(null);
        if (nonNull(order)) {
            if (order.getItems() == null) {
                order.setItems(new ArrayList<>());
            }

            Product product = productRepository.findByProductName(addItemRequest.getProductName());
            Integer amount = addItemRequest.getAmount();
            Integer totalPrice = amount * product.getPrice();
            OrderItem orderItem = new OrderItem(order, product, amount, totalPrice);

            order.getItems().add(orderItem);
            orderRepository.save(order);
        }
    }
}
