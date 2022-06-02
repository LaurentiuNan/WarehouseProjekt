package ro.itschool.warehouse.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductModel {

    @Id
    private int labelNumber;

    private String name;
    private int expiringYear;
    private int quantity;

    @ManyToOne
    private ProductModel deposit;

    public int getLabelNumber() {
        return labelNumber;
    }

    public void setLabelNumber(int labelNumber) {
        this.labelNumber = labelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpiringYear() {
        return expiringYear;
    }

    public void setExpiringYear(int expiringYear) {
        this.expiringYear = expiringYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductModel getDeposit() {
        return deposit;
    }

    public void setDeposit(ProductModel deposit) {
        this.deposit = deposit;
    }
}
