package com.springboot.banking.Impl;

import org.springframework.stereotype.Service;

import com.springboot.banking.Mapper.AccountMapper;
import com.springboot.banking.dto.AccountDto;
import com.springboot.banking.entity.Account;
import com.springboot.banking.repository.AccountRepo;
import com.springboot.banking.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {
	
	private AccountRepo repo;
	

	public AccountServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account =AccountMapper.mapToAccount(accountDto);
		Account savedAccount=repo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}


	@Override
	public AccountDto getAccountById(Integer Id) {
		Account account=repo.findById(Id).orElseThrow(()->new RuntimeException("Account Does Not Exists"));
		return AccountMapper.mapToAccountDto(account);
	}


	@Override
	public AccountDto deposit(Integer Id, double amount) {
		Account account=repo.findById(Id).orElseThrow(()->new RuntimeException("Account Does Not Exists"));
		double total=account.getBalance()+ amount;
		account.setBalance(total);
		Account savedAccount=repo.save(account);
	    return AccountMapper.mapToAccountDto(savedAccount);
	}

}
