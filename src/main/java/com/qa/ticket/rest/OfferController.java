package com.qa.ticket.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ticket.domain.Ticket;
import com.qa.ticket.service.TicketService;

@RestController
public class OfferController {
	
	@Autowired
	private TicketService service;
	
    @RequestMapping("/random")
    public Ticket offer() {
    	Ticket generatedTicket = service.generateTicket();
		return generatedTicket;
    }
}
