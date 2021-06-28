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

    public Response sendRequest(Request request) throws ParentRuntimeException {
        // ...use httpClient to send request
        if (true) {
            throw new ParentRuntimeException();
        }
        return null;
    }
}
