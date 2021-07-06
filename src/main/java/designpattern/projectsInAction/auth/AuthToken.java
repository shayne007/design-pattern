package designpattern.projectsInAction.auth;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class AuthToken {
    private String token;
    private long timestamp;

    public AuthToken(String token, long timestamp) {
        this.timestamp = timestamp;
        this.token = token;
    }

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        return null;
    }

    public boolean isExpired() {
        return false;
    }

    public boolean match(AuthToken clientAuthToken) {
        return false;
    }
}
