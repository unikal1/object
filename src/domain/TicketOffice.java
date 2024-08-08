package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : <span style="color: orange;">domain</span> <br>
 * name : <span style="color: orange;">TicketOffice</span> <br>
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
public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
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