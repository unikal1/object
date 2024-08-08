package domain;

/**
 * packageName : <span style="color: orange;">domain</span> <br>
 * name : <span style="color: orange;">Audience</span> <br>
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
public class Audience {

    private Bag bag;
    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
