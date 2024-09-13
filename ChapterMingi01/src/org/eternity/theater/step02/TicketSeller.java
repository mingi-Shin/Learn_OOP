package org.eternity.theater.step02;

// 판매원 
public class TicketSeller {

	private TicketOffice ticketOffice;
	
	public TicketSeller (TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
	// 이제 외부에서 ticketOffice에 접근 할 수 없다. ticketSeller만 ticketOffice에 접근가능
//	public TicketOffice getTicketOffice() {
//		return ticketOffice;
//	}
	
	//이제 티켓 판매교환은 극장이 아니라 판매원이 담당 
	public void sellTo(Audience audience) {
		if(audience.getBag().hasInvitation()) {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().setTicket(ticket);
		}else {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.fee());
			ticketOffice.plusAmount(ticket.fee());
			audience.getBag().setTicket(ticket);
		}
	
	}
	
}

//객체 내부의 세부적인 사항을 감춤 = 내부로의 접근을 제한 -> 캡슐화: 결합도 낮아짐, 변경 용이  