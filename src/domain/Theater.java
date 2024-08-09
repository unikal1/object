package domain;

public class Theater {

    public boolean enter(Audience audience) {
        Ticket ticket = audience.giveTicket();
        return ticket != null;
    }
}
