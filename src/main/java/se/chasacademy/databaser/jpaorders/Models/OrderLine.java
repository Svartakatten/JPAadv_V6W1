package se.chasacademy.databaser.jpaorders.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "T_ORDER_LINE")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_LINE_ID")
    private Long id;

    @Column(name = "LINE_NUMBER", nullable = false)
    private Integer lineNumber;

    @Column(name = "QTY", nullable = false)
    private Integer quantity;

    @Column(name = "LINE_TOTAL_CENTS", nullable = false)
    private Integer lineTotalCents;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private Order order;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    public OrderLine() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getLineTotalCents() {
        return lineTotalCents;
    }

    public void setLineTotalCents(Integer lineTotalCents) {
        this.lineTotalCents = lineTotalCents;
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
}
