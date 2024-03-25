package springs.springcoffee.dto;

public class AddSupplyRequest {

    private String productName;
    private Integer supplyAmount;

    public AddSupplyRequest() {
    }

    public AddSupplyRequest(String productName, Integer supplyAmount) {
        this.productName = productName;
        this.supplyAmount = supplyAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplyAmount() {
        return supplyAmount;
    }

    public void setSupplyAmount(Integer supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    @Override
    public String toString() {
        return "AddSupplyRequest{" +
                "productName='" + productName + '\'' +
                ", supplyAmount=" + supplyAmount +
                '}';
    }
}
