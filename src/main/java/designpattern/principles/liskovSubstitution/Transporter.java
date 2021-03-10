package designpattern.principles.liskovSubstitution;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */

public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Transporter() {

    }

    public Response sendRequest(Request request) throws NoAuthorizationRuntimeException {
        // ...use httpClient to send request
        return null;
    }
}
