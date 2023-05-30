package com.fpoly.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_id;
    String name;
    String image;
    Double price;

    @Column(name = "create_date")
    java.util.Date createDate = new java.util.Date();
    
    Boolean available;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;
}
