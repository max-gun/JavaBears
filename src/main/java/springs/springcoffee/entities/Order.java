package springs.springcoffee.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

/**
 * @author max.gun
 * @since 28/03/2024
 */
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    private Integer totalSum;

    private Date orderDate;
}
