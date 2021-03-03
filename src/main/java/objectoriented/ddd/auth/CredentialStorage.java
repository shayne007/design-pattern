package objectoriented.ddd.auth;

public interface CredentialStorage {
    String getPasswordByAppId(String appId);
}
