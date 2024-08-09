package domain;

public class Audience {

    private Bag bag;
    public Audience(Bag bag) {
        this.bag = bag;
    }


    public Long buyTicket(Ticket ticket) {
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.minusAmount(ticket.getFee());
            bag.setTicket(ticket);
            return ticket.getFee();
        }
    }

    public Ticket giveTicket() {
        return bag.getTicket();
    }
}
