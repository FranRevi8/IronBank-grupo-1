package com.grupo1.IronBank.model;

import com.grupo1.IronBank.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@MappedSuperclass
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal balance;
    private String secretKey;

    @OneToOne
    private AccountHolder primaryOwner;

    @OneToOne
    private AccountHolder secondaryOwner;

    private BigDecimal penaltyFee;
    private LocalDate creationDate;
    private Status status;

    @ManyToMany
    private List<ThirdParty> thirdParty;

    public Account() {
        this.penaltyFee = BigDecimal.valueOf(40);
        this.status = Status.ACTIVE;
        this.creationDate = LocalDate.now();
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = BigDecimal.valueOf(40);
    }

}
