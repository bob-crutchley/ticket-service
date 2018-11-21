package com.qa.ticket.service;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import com.qa.ticket.domain.Ticket;

@Service
public class TicketService {

	private static final int AMOUNT_OF_NUMBERS_ON_TICKET = 10;

	public Ticket generateTicket() {
		Random r = new Random();
		int minNumber = 0;
		int maxNumber = 4;
		Ticket ticket = new Ticket("This ticket is not a winner");
		int randomNumber = r.nextInt(maxNumber - minNumber) + minNumber;
		if (randomNumber == 0) {
			ticket.setTicketNumber("prem:" + RandomStringUtils.random(AMOUNT_OF_NUMBERS_ON_TICKET, String.valueOf(System.currentTimeMillis())));
		} else if (randomNumber == 1) {
			ticket.setTicketNumber("gold:" + RandomStringUtils.random(10, String.valueOf(System.currentTimeMillis())));
		} else if(randomNumber == 2){
			ticket.setTicketNumber("silv" + RandomStringUtils.random(10, String.valueOf(System.currentTimeMillis())));
		}
		else {return ticket;}
		return ticket;
	}

}
