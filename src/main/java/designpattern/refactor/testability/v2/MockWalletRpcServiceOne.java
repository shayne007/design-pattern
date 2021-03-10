package designpattern.refactor.testability.v2;

import designpattern.refactor.testability.WalletRpcService;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */

public class MockWalletRpcServiceOne extends WalletRpcService {
    @Override
    public String moveMoney(String id, Long fromUserId, Long toUserId, Double amount) {
        return "123bac";
    }
}
