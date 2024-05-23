package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class InvoiceProduct extends BaseEntity{
    private BigDecimal profit;
    private int quantity;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Product product;
}
