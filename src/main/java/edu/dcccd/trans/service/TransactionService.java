package edu.dcccd.trans.service;

import edu.dcccd.trans.entity.SelectedDay;
import edu.dcccd.trans.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
public interface TransactionService
{
    void createTransaction(Transaction transaction);
    List<Transaction> getAllTransaction();
}
