package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankAccount;

@RestController
public class producerController {

	@GetMapping(value = "/get/{acNo}")
	public ResponseEntity<BankAccount> getsingleBankData(@PathVariable("acNo") double acNo) {
		List<BankAccount> blist = new ArrayList<BankAccount>();

		BankAccount bankaccount = new BankAccount();
		bankaccount.setAcNo(1001d);
		bankaccount.setfName("Rajshri");
		bankaccount.setlName("Bendale");
		bankaccount.setEmail("rajshribendale@gamil.com");
		bankaccount.setPanNo("Auzpn56453");
		bankaccount.setAdharCard(123454324566d);

		BankAccount bankaccount1 = new BankAccount();
		bankaccount1.setAcNo(1002d);
		bankaccount1.setfName("Uday");
		bankaccount1.setlName("Chaudhari");
		bankaccount1.setEmail("Abc@gamil.com");
		bankaccount1.setPanNo("Abnchg56453");
		bankaccount1.setAdharCard(765434466d);

		blist.add(bankaccount);
		blist.add(bankaccount1);
		for (BankAccount bankAccount2 : blist) {
			if (acNo == bankAccount2.getAcNo()) {

				return ResponseEntity.ok(bankAccount2);

			} else {
				System.out.println("account does not exists");
			}

		}
		return null;

	}

}
