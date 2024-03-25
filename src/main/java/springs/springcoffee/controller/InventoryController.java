package springs.springcoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springs.springcoffee.dto.AddSupplyRequest;
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

    @RequestMapping(method = RequestMethod.POST,value = "/addSupply")
    public Boolean addSupply(@RequestBody AddSupplyRequest addSupplyRequest) {
        inventoryService.addSupply(addSupplyRequest);
        return true;
    }
}
