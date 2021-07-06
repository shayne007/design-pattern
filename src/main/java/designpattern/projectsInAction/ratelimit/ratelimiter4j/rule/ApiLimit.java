package designpattern.projectsInAction.ratelimit.ratelimiter4j.rule;

import lombok.Data;
import lombok.ToString;

/**
 * @author fengsy
 * @date 7/6/21
 * @Description
 */
@Data
@ToString
public class ApiLimit {
    private static final int DEFAULT_TIME_UNIT = 1;
    private int limit;
    private String api;
    private int unit = DEFAULT_TIME_UNIT;

    public ApiLimit() {
    }

    public ApiLimit(String api, int limit) {
        this(api, limit, DEFAULT_TIME_UNIT);
    }

    public ApiLimit(String api, int limit, int unit) {
        this.api = api;
        this.limit = limit;
        this.unit = unit;
    }

}
