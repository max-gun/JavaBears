package springs.springcoffee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.springcoffee.dao.ProductRepository;
import springs.springcoffee.entities.Product;
import springs.springcoffee.service.InventoryService;

import java.util.List;
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
