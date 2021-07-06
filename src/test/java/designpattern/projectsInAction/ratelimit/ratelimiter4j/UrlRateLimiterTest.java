package designpattern.projectsInAction.ratelimit.ratelimiter4j;


import designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.ApiLimit;
import designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.RateLimitRule;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * @author fengsy
 * @date 7/6/21
 * @Description
 */
@Test
public class UrlRateLimiterTest {
    public void testLimit() {
        RateLimitRule rule = Mockito.mock(RateLimitRule.class);
        when(rule.getLimit(any(), any())).thenReturn(new ApiLimit("/rt", 10));
        

    }
}
