package domain;

/**
 * packageName : <span style="color: orange;">domain</span> <br>
 * name : <span style="color: orange;">Bag</span> <br>
 * <p>
 * <span style="color: white;">[description]</span>
 * </p>
 * see Also: <br>
 *
 * <pre>
 * code usage:
 * {@code
 *
 * }
 * modified log:
 * ==========================================================
 * DATE          Author           Note
 * ----------------------------------------------------------
 * 8/8/24        isanghyeog         first create
 *
 * </pre>
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
