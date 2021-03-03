package objectoriented.ddd.auth;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class ApiRequest {
    private String appId;
    private String token;
    private long timestamp;
    private String originalUrl;

    public static ApiRequest buildFromUrl(String url) {
        return null;
    }

    public String getAppId() {
        return appId;
    }

    public String getToken() {
        return this.token;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getOriginalUrl() {
        return this.originalUrl;
    }
}
