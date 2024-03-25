package springs.springcoffee.service;

import java.util.Map;

public interface InventoryService {
    Integer getAmountOfProduct(String productName);

    Map<String, Integer> getFullInventory();

    //Integer getAmountOfProductV2(String productName);
}
