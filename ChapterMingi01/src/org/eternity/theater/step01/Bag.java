package org.eternity.theater.step01;

//가방 
public class Bag {
	
	private Long amount; //현금 
	private Invitation invitation; //초대장 
	private Ticket ticket; //티켓 
	
	//관람객은 이벤트당첨자 가방 or 비당첨자 가방: 인스턴스 생성하는 시점에 제약을 강제할 수 있도록 생성자를 추가 
	// 1. 당첨자 가방
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	} 
	
	// 2. 비당첨자 가방
	public Bag(long amount) {
		this(null, amount); // 생성자오버로딩: 매개변수 갯수,타입 일치 생성자 호출, 재사용 
	}
	
	
	public boolean hasInvitation() {
		return invitation != null;
	}
	
	public boolean hasTicket() {
		return ticket != null;
	}
	
	public void setTicket(Ticket ticket) { //초대장을 티켓으로 교환 
		this.ticket = ticket;
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
	
}
