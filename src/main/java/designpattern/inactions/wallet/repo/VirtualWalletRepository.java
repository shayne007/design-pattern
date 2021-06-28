package designpattern.inactions.wallet.repo;

import java.math.BigDecimal;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class VirtualWalletRepository {
    public VirtualWalletEntity getWalletEntity(Long walletId) {
        return null;
    }

    public BigDecimal getBalance(Long walletId) {
        return null;
    }

    public void updateBalance(Long walletId, BigDecimal balance) {
    }
}
