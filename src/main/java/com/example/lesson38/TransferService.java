package com.example.lesson38;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(long idSender, long idReceive, BigDecimal amount){
        Account sender = accountRepository.findAccountById(idSender);
        Account receiver = accountRepository.findAccountById(idReceive);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount); //"-"
        BigDecimal receiveNewAmount = receiver.getAmount().add(amount); //"+"

        accountRepository.changeAmount(idSender, senderNewAmount);
        accountRepository.changeAmount(idReceive, receiveNewAmount);

        //throw new RuntimeException("Oh no! Error");
    }

    public List<Account> getAllAccounts(){
        return accountRepository.finadAllAccount();
    }
}
