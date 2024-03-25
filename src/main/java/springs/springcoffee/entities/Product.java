package springs.springcoffee.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long productId;

    @Column(name = "product_name", unique = true, nullable = false, length = 100)
    private String productName;

    @Column(name = "price",nullable = false)
    private Integer price;

    @Column(name = "description", length = 100)
    private String desc;

    @Enumerated(EnumType.STRING)
    private Sensitivity sensitivities;

    private Integer supply;

    public Product() {
    }

    public Product(String productName, Integer price, String desc, Sensitivity sensitivities) {
        this.productName = productName;
        this.price = price;
        this.desc = desc;
        this.sensitivities = sensitivities;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Sensitivity getSensitivities() {
        return sensitivities;
    }

    public void setSensitivities(Sensitivity sensitivities) {
        this.sensitivities = sensitivities;
    }

    public Integer getSupply() {
        return supply;
    }

    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", sensitivities=" + sensitivities +
                ", supply=" + supply +
                '}';
    }
}
