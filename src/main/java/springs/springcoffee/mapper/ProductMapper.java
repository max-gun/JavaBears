package springs.springcoffee.mapper;

import springs.springcoffee.dto.NewProductRequest;
import springs.springcoffee.entities.Product;
import springs.springcoffee.entities.Sensitivity;

public class ProductMapper {

    public static Product mapToProduct(NewProductRequest npr) {
        Product product = new Product(npr.getProductName(),
                npr.getPrice(),
                npr.getDescription(),
                Sensitivity.valueOf(npr.getSensitivities().toUpperCase()));
        return product;
    }
}
