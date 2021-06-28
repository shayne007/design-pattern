package designpattern.principles.lod.download.bad;

import designpattern.principles.lod.download.Html;
import designpattern.principles.lod.download.HtmlRequest;

/**
 * @author fengsy
 * @date 6/26/21
 * @Description
 */
public class HtmlDownloader {
    private NetworkTransporter transporter;//通过构造函数或IOC注入

    public Html downloadHtml(String url) {
        byte[] rawHtml = transporter.send(new HtmlRequest(url));
        return new Html(rawHtml);
    }
}