package org.eternity.theater.step01;

public class Theater {
	
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		
		//초대장있으면 티켓 꺼내고 가방에 셋팅 
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().setTicket(ticket);
		}
		//없으면 티켓 꺼내고 티켓값 계산하고 가방에 셋팅 
		else {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().minusAmount(ticket.fee());
			ticketSeller.getTicketOffice().plusAmount(ticket.fee());
			audience.getBag().setTicket(ticket);
		}
	}

}
