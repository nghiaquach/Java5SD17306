package com.fpoly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fpoly.model.OrderDetail;
import com.fpoly.model.Report;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer>{
    @Query("SELECT new Report(d.product.category, SUM(d.price * d.quantity), SUM(d.quantity)) FROM OrderDetail d GROUP BY d.product.category")
    List<Report> getInventoryByCategory();
}
