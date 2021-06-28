package designpattern.principles.lod.download;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class HtmlRequest {
    private String address;
    private String content;

    public HtmlRequest(String url) {
    }

    public String getAddress() {
        return this.address;
    }

    public String getContent() {
        return this.content;
    }
}