package objectoriented.ddd.auth;

public interface ApiAuthenticator {
    void auth(String url);

    void auth(ApiRequest request);
}
