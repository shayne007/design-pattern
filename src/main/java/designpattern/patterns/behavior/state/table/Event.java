package designpattern.patterns.behavior.state.table;

/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);

    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
