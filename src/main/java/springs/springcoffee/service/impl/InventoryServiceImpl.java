package springs.springcoffee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.springcoffee.dao.ProductRepository;
import springs.springcoffee.dto.AddSupplyRequest;
import springs.springcoffee.entities.Product;
import springs.springcoffee.service.InventoryService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Override
    public void addSupply(AddSupplyRequest addSupplyRequest) {
        String productName = addSupplyRequest.getProductName();
        Integer supplyAmount = addSupplyRequest.getSupplyAmount();

        Product product = productRepository.findByProductName(productName);
        Integer newSupply = product.getSupply() + supplyAmount;
        product.setSupply(newSupply);

        productRepository.save(product);
    }
}
