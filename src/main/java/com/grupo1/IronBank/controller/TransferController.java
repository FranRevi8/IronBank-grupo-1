package com.grupo1.IronBank.controller;

import com.grupo1.IronBank.model.Transfer;
import com.grupo1.IronBank.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @GetMapping
    public List<Transfer> getAllTransfers(){return transferService.getAllTransfers();}

    @GetMapping("/{id}")
    public ResponseEntity<Transfer> getTransferById(@PathVariable Long id){
        Optional<Transfer> transfer = transferService.getTransferById(id);
        return transfer.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createTransfer(@RequestBody Transfer transfer) {
        try {
            Transfer createdTransfer = transferService.createTransfer(transfer);
            return ResponseEntity.ok(createdTransfer);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
