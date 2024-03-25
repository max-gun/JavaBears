package springs.springcoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springs.springcoffee.service.InventoryService;

import java.util.Map;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @RequestMapping("/getStockAmount/{productName}")
    public Integer getStockAmount(@PathVariable("productName") String productName) {
        Integer amount = inventoryService.getAmountOfProduct(productName);
        return amount;
    }

    @RequestMapping("/getInventory")
    public Map<String, Integer> getFullInventory() {
        Map<String,Integer> inventory = inventoryService.getFullInventory();
        return inventory;
    }
}
