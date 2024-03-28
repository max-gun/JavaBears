package springs.springcoffee.entities;

import jakarta.persistence.*;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer amount;

    private Integer priceSum;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer amount, Integer priceSum) {
        this.order = order;
        this.product = product;
        this.amount = amount;
        this.priceSum = priceSum;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(Integer priceSum) {
        this.priceSum = priceSum;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", order=" + order +
                ", product=" + product +
                ", amount=" + amount +
                ", priceSum=" + priceSum +
                '}';
    }
}
