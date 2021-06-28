package designpattern.principles.lod.download.better;

import designpattern.principles.lod.download.Html;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */

public class Document {
    private Html html;
    private String url;

    Document(String url, Html h) {
        this.html = h;
        this.url = url;
    }
    // ...
}
