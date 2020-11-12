package patterns.behavior.memento;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
