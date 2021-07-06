package designpattern.continuouslyRefactor.testability.v2;

import designpattern.continuouslyRefactor.testability.WalletRpcService;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */
public class MockWalletRpcServiceTwo extends WalletRpcService {
    @Override
    public String moveMoney(String id, Long fromUserId, Long toUserId, Double amount) {
        return null;
    }
}