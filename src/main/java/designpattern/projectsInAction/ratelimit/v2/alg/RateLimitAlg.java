package designpattern.projectsInAction.ratelimit.v2.alg;

public interface RateLimitAlg {
    boolean tryAcquire() throws FixedTimeWinRateLimitAlg.InternalErrorException;
}
