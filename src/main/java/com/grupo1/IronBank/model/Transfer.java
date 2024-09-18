package com.grupo1.IronBank.model;

import com.grupo1.IronBank.classes.Money;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long originAccountId;
    private Long destinyAccountId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "amount_amount")),
            @AttributeOverride(name= "currency", column = @Column(name= "amount_currency"))
    })
    private Money amount;

    private String concept;


}
