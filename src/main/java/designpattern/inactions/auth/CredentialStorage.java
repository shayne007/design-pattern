package designpattern.inactions.auth;

public interface CredentialStorage {
    String getPasswordByAppId(String appId);
}
