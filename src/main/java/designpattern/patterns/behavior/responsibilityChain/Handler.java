package designpattern.patterns.behavior.responsibilityChain;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
