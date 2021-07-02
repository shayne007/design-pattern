package designpattern.inactions.ratelimit.v2.rule;

public interface RateLimitRule {
    ApiLimit getLimit(String appId, String url);
}
