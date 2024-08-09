package domain;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTicket(Audience audience) {
        Ticket newTicket  = ticketOffice.getTicket();
        Long fee = audience.buyTicket(newTicket);

        ticketOffice.minusAmount(fee);
    }


}
