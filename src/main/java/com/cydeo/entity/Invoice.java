package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Invoice extends BaseEntity{
    private LocalDate invoiceDate;
    private String invoiceNumber;
    private String invoiceType;
    @ManyToOne
    private Client client;
}
