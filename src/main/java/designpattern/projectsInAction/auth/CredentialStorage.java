package designpattern.projectsInAction.auth;

public interface CredentialStorage {
    String getPasswordByAppId(String appId);
}
