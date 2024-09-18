package com.grupo1.IronBank.repository;

import com.grupo1.IronBank.model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

}
