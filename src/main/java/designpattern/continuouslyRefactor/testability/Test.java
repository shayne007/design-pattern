package designpattern.continuouslyRefactor.testability;

import lombok.SneakyThrows;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */
public class Test {

    @SneakyThrows
    public void testExecute() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "133345";
        designpattern.continuouslyRefactor.testability.Transaction transaction =
            new designpattern.continuouslyRefactor.testability.Transaction(null, buyerId, sellerId, productId, orderId);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
    }

    @SneakyThrows
    public void testExecute_with_TransactionIsExpired() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "133345";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 暴露 createTimestamp 的 set 方法，虽然带来了灵活性，但也带来了不可控性。
        // transaction.setCreatedTimestamp(System.currentTimeMillis() - 14);

        boolean actualResult = transaction.execute();
        assertFalse(actualResult);
        assertEquals(STATUS.EXPIRED, transaction.getStatus());
    }

    private void assertEquals(STATUS expired, STATUS status) {}

    private void assertFalse(boolean actualResult) {}

    private void assertTrue(boolean executedResult) {}
}
