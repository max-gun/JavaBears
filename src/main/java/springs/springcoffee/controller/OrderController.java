package springs.springcoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springs.springcoffee.dto.AddItemRequest;
import springs.springcoffee.service.OrderService;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/new_order")
    public Long openOrder() {
        Long orderId = orderService.openOrder();
        return orderId;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/order/add_item")
    public Boolean addItemToOrder(@RequestBody AddItemRequest addItemRequest) {
        orderService.addItemToOrder(addItemRequest);
        return true;
    }

    public Boolean closeOrder(){
        return true;
    }

    public Boolean editOrder() {
        return true;
    }
}
