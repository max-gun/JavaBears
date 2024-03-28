package springs.springcoffee.dto;

/**
 * @author max.gun
 * @since 28/03/2024
 */
public class AddItemRequest {
    private Long orderId;
    private String productName;
    private Integer amount;

    public AddItemRequest() {
    }

    public AddItemRequest(Long orderId, String productName, Integer amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AddItemRequest{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
