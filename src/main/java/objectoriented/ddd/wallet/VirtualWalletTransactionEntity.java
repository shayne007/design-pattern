package objectoriented.ddd.wallet;

import java.math.BigDecimal;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class VirtualWalletTransactionEntity {
    private BigDecimal amount;
    private long createTime;
    private TransactionType type;
    private Long fromWalletId;
    private Long toWalletId;

    public void setCreateTime(long currentTimeMillis) {
        this.createTime = createTime;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setFromWalletId(Long walletId) {
        this.fromWalletId = walletId;
    }

    public void setToWalletId(Long toWalletId) {
        this.toWalletId = toWalletId;
    }
}
