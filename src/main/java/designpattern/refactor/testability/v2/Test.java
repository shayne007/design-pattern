package designpattern.refactor.testability.v2;

import designpattern.refactor.testability.STATUS;
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
        designpattern.refactor.testability.Transaction transaction =
            new designpattern.refactor.testability.Transaction(null, buyerId, sellerId, productId, orderId);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
    }

    @SneakyThrows
    public void testExecute2() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "133345";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(STATUS.EXECUTED, transaction.getStatus());
    }

    @SneakyThrows
    public void testExecute3() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "133345";

        TransactionLock mockLock = new TransactionLock() {
            @Override
            public boolean lock(String id) {
                return true;
            }

            public void unlock() {}
        };

        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        transaction.setTransactionLock(mockLock);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
        assertEquals(STATUS.EXECUTED, transaction.getStatus());
    }

    @SneakyThrows
    public void testExecute_with_TransactionIsExpired() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "133345";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId) {
            @Override
            protected boolean isExpired() {
                return true;
            }
        };
        boolean actualResult = transaction.execute();
        assertFalse(actualResult);
        assertEquals(STATUS.EXPIRED, transaction.getStatus());
    }

    private void assertFalse(boolean actualResult) {}

    private void assertEquals(STATUS executed, STATUS status) {}

    private void assertTrue(boolean executedResult) {}
}
