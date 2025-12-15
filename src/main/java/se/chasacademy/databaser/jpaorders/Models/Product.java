package se.chasacademy.databaser.jpaorders.Models;

import jakarta.persistence.*;
import org.hibernate.type.YesNoConverter;

@Entity
@Table(name = "T_PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROD_ID")
    private Long id;

    @Column(name = "PROD_NAME", length = 150, nullable = false)
    private String name;

    @Column(name = "PROD_DESC", length = 500)
    private String description;

    @Column(name = "UNIT_PRICE_CENTS", nullable = false)
    private int unitPriceCents;

    @Column(name = "ACTIVE_FLAG", nullable = false, length = 1)
    @Convert(converter = YesNoConverter.class)
    private boolean active;

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPriceCents() {
        return unitPriceCents;
    }

    public void setUnitPriceCents(int unitPriceCents) {
        this.unitPriceCents = unitPriceCents;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
