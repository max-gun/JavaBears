package springs.springcoffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springs.springcoffee.dto.NewProductRequest;
import springs.springcoffee.entities.Product;
import springs.springcoffee.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/menu")
    public List<Product> getMenu() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/menu/add")
    public Boolean addProduct(@RequestBody NewProductRequest newProductRequest) {
        productService.addProduct(newProductRequest);
        return true;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/menu/add_multiple")
    public Boolean addProducts(@RequestBody List<NewProductRequest> newProductRequests){
        productService.addProducts(newProductRequests);
        return true;
    }
}
