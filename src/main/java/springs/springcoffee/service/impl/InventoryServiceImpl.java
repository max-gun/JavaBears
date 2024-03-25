package springs.springcoffee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.springcoffee.dao.ProductRepository;
import springs.springcoffee.entities.Product;
import springs.springcoffee.service.InventoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Integer getAmountOfProduct(String productName) {
        Integer supplyOfProduct = productRepository.getSupplyOfProduct(productName);
        return supplyOfProduct;
    }

    @Override
    public Map<String, Integer> getFullInventory() {
        List<Object[]> queryResult = productRepository.getFullInventory();

        /*Map<String, Integer> inventory = new HashMap<>();

        queryResult.forEach(obj -> {
            String productName = (String) obj[0];
            Integer productAmount = (Integer) obj[1];
            inventory.put(productName, productAmount);
        });*/

        Map<String, Integer> inventory = queryResult.stream()
                .collect(Collectors.toMap(
                        arr -> (String) arr[0],
                        arr -> (Integer) arr[1]
                ));

        return inventory;
    }

    //@Override
    public Integer getAmountOfProductV2(String productName) {
        /*
        List<Product> products = productRepository.findAll();
        Product product = products.stream()
                .filter(p -> p.getProductName().equals(productName))
                .toList()
                .get(0);


        Product product = productRepository.findByName(productName).get(0);
        Integer supplyOfProduct =  product.getSupply();
        return supplyOfProduct;

         */
        return null;
    }
}
