package designpattern.objectoriented.encapsulation;

import designpattern.patterns.create.singleton.IdGenerator;

import java.math.BigDecimal;

/**
 * @author fengsy
 * @date 6/23/21
 * @Description
 */


public class Wallet {
    private Long id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;
    // ...省略其他属性...

    public Wallet() {
        this.id = IdGenerator.getInstance().getId();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    // 注意：下面对get方法做了代码折叠，是为了减少代码所占文章的篇幅
    public Long getId() {
        return this.id;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public long getBalanceLastModifiedTime() {
        return this.balanceLastModifiedTime;
    }

    public void increaseBalance(BigDecimal increasedAmount) throws InvalidAmountException {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreasedAmount) throws InvalidAmountException, InsufficientAmountException {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        if (decreasedAmount.compareTo(this.balance) > 0) {
            throw new InsufficientAmountException("...");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
}