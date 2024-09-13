package org.eternity.theater.step02;


//극장 
public class Theater {
	
	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}
	
	public void enter(Audience audience) {
		
		/* 티켓 판매는 판매원 담당으로 바뀜 
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().setTicket(ticket);
		}else {
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			audience.getBag().minusAmount(ticket.fee());
			ticketSeller.getTicketOffice().plusAmount(ticket.fee());
			audience.getBag().setTicket(ticket);
		}
		*/
		ticketSeller.sellTo(audience);
		
	}

}
