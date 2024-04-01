package springs.springcoffee.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@Entity
@Table(name = "order_receipt")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    private Integer totalSum;

    private Integer discount;

    private Date orderDate;

    private Boolean isClosed;

    public Order() {
        this.isClosed = false;
        this.discount = 0;
        this.totalSum = 0;
    }

    public Order(List<OrderItem> items, Integer totalSum, Integer discount, Date orderDate, Boolean isClosed) {
        this.items = items;
        this.totalSum = totalSum;
        this.discount = discount;
        this.orderDate = orderDate;
        this.isClosed = isClosed;
    }

    public Long getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Integer getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Integer totalSum) {
        this.totalSum = totalSum;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Boolean isClosed() {
        return isClosed;
    }

    public void close() {
        isClosed = true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", items=" + items +
                ", totalSum=" + totalSum +
                ", discount=" + discount +
                ", orderDate=" + orderDate +
                ", isClosed=" + isClosed +
                '}';
    }
}
