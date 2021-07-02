package designpattern.inactions.ratelimit.v2.alg;

public interface RateLimitAlg {
    boolean tryAcquire() throws FixedTimeWinRateLimitAlg.InternalErrorException;
}
