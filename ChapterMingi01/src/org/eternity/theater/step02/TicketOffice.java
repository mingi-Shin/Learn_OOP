package org.eternity.theater.step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
	
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>(); //판매,교환 티켓 
	
	public TicketOffice (Long amount, Ticket ...tickets) { //가변인수: n개의 Ticket객체를 배열 형태로 전달받음  
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets)); 
		//tickets필드는 List<Ticket>자료형으로 선언되어 있기에, 받은 배열을 리스트로 변환해줌 
	}
	
	public Ticket getTicket() {
		return tickets.remove(0);
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	

}
