package springs.springcoffee.dto;

public class NewProductRequest {

    private String productName;
    private Integer price;
    private String description;
    private String sensitivities;

    public NewProductRequest() {
    }

    public NewProductRequest(String productName, Integer price, String description, String sensitivities) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.sensitivities = sensitivities;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSensitivities() {
        return sensitivities;
    }

    public void setSensitivities(String sensitivities) {
        this.sensitivities = sensitivities;
    }

    @Override
    public String toString() {
        return "NewProductRequest{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", sensitivities='" + sensitivities + '\'' +
                '}';
    }
}
