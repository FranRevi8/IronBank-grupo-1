package com.grupo1.IronBank.service;

import com.grupo1.IronBank.model.CreditCard;
import com.grupo1.IronBank.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCreditCards(){return creditCardRepository.findAll();}

    public Optional<CreditCard> getCreditCardById(Long id){
        return creditCardRepository.findById(id);
    }

    public CreditCard createCreditCard(CreditCard creditCard){
        return creditCardRepository.save(creditCard);
    }

    public boolean deleteCreditCard(Long id){
        if(creditCardRepository.existsById(id)){
            creditCardRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<CreditCard> updateCreditCard(Long id, CreditCard creditCard){
        if(creditCardRepository.existsById(id)){
            creditCard.setId(id);
            return Optional.of(creditCardRepository.save(creditCard));
        }
        return Optional.empty();
    }
}
