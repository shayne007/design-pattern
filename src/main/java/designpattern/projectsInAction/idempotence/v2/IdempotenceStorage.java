package designpattern.projectsInAction.idempotence.v2;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public interface IdempotenceStorage {
    boolean saveIfAbsent(String idempotenceId);

    void delete(String idempotenceId);
}
