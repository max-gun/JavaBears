package springs.springcoffee.service;

import springs.springcoffee.dto.AddSupplyRequest;

import java.util.Map;

public interface InventoryService {
    Integer getAmountOfProduct(String productName);

    Map<String, Integer> getFullInventory();

    void addSupply(AddSupplyRequest addSupplyRequest);
}
