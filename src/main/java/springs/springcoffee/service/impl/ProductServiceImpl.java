package springs.springcoffee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springs.springcoffee.dao.ProductRepository;
import springs.springcoffee.dto.NewProductRequest;
import springs.springcoffee.entities.Product;
import springs.springcoffee.mapper.ProductMapper;
import springs.springcoffee.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(NewProductRequest newProductRequest) {
        Product product = ProductMapper.mapToProduct(newProductRequest);
        productRepository.save(product);
    }

    @Override
    public void addProducts(List<NewProductRequest> newProductRequests) {
        List<Product> products = newProductRequests.stream()
                .map(ProductMapper::mapToProduct)
                .toList();

        productRepository.saveAll(products);
    }
}
