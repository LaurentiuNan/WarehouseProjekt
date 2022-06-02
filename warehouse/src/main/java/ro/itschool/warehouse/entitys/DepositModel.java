package ro.itschool.warehouse.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepositModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identNumber;

    private String town;
    private String street;
    private int numberOfStreet;
    private int size;

    public int getIdentNumber() {
        return identNumber;
    }

    public void setIdentNumber(int identNumber) {
        this.identNumber = identNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfStreet() {
        return numberOfStreet;
    }

    public void setNumberOfStreet(int numberOfStreet) {
        this.numberOfStreet = numberOfStreet;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
