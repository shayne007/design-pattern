package designpattern.principles.lod.download.better;

import designpattern.principles.lod.download.Html;
import designpattern.principles.lod.download.HtmlRequest;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */

public class HtmlDownloader {
    private NetworkTransporter transporter;// 通过构造函数或IOC注入

    /**
     * transporter使用了更通用的实现后，需要从HtmlRequest中取出相应的参数进行调用
     */
    public Html downloadHtml(String url) {
        HtmlRequest htmlRequest = new HtmlRequest(url);
        byte[] rawHtml = transporter.send(htmlRequest.getAddress(), htmlRequest.getContent().getBytes());
        return new Html(rawHtml);
    }
}
