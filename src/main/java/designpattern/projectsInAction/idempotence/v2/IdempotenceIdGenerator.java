package designpattern.projectsInAction.idempotence.v2;

import java.util.UUID;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public class IdempotenceIdGenerator {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}