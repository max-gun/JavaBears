package springs.springcoffee.service;

import springs.springcoffee.dto.NewProductRequest;
import springs.springcoffee.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void addProduct(NewProductRequest newProductRequest);

    void addProducts(List<NewProductRequest> newProductRequests);
}
