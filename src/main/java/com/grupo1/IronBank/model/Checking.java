package com.grupo1.IronBank.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Checking extends Account implements Serializable {

    private BigDecimal minimumBalance;
    private BigDecimal monthlyMaintenanceFee;
}
