package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;
import java.sql.Date;

@Entity
public class Order {
    @Id
    public Integer id;
    public Date date_order;
    public Double sum_order;
    public String name_order;
    public Integer quantity;


    public Order(Integer id, Date date_order, Double sum_order, String name_order, Integer quantity) {
        this.id = id;
        this.date_order = date_order;
        this.sum_order = sum_order;
        this.name_order = name_order;
        this.quantity = quantity;
    }

    public Order() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public Double getSum_order() {
        return sum_order;
    }

    public void setSum_order(Double sum_order) {
        this.sum_order = sum_order;
    }

    public String getName_order() {
        return name_order;
    }

    public void setName_order(String name_order) {
        this.name_order = name_order;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
