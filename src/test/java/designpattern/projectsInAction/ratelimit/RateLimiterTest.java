package designpattern.projectsInAction.ratelimit;

import designpattern.projectsInAction.ratelimit.v1.RateLimiter;
import designpattern.projectsInAction.ratelimit.v1.alg.RateLimitAlg;
import designpattern.projectsInAction.ratelimit.v2.RateLimiterV2;
import designpattern.projectsInAction.ratelimit.v2.alg.FixedTimeWinRateLimitAlg;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengsy
 * @date 7/5/21
 * @Description
 */
@Slf4j
public class RateLimiterTest {
    @Test
    public void testLimit() throws RateLimitAlg.InternalErrorException {
        boolean passed = new RateLimiter().limit("app-2", "/v1/user");
        Assert.assertTrue(passed);
    }

    @Test
    public void testLimitV2() throws FixedTimeWinRateLimitAlg.InternalErrorException {
        boolean passed = new RateLimiterV2().limit("app-2", "/v1/user");
        Assert.assertTrue(passed);
    }

}
