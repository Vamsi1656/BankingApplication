package com.springboot.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	
	private int Id;
	
	private String AccountHolderName;
	
	private double balance;

}
