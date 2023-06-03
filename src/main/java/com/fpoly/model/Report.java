package com.fpoly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Report implements java.io.Serializable {
    @Id
    Category category;
    double revenue;
    long quantity;
}
