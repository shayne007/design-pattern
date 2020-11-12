package patterns.behavior.memento;

import java.util.Stack;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();


    public Snapshot popSnapshot() {
        return snapshots.pop();
    }


    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
