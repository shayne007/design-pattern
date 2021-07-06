package designpattern.projectsInAction.auth;

public interface ApiAuthenticator {
    void auth(String url);

    void auth(ApiRequest request);
}
