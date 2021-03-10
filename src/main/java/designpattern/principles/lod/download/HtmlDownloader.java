package designpattern.principles.lod.download;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */

public class HtmlDownloader {
    private NetworkTransporter transporter;// 通过构造函数或IOC注入

    // HtmlDownloader这里也要有相应的修改
    public Html downloadHtml(String url) {
        HtmlRequest htmlRequest = new HtmlRequest(url);
        byte[] rawHtml = transporter.send(htmlRequest.getAddress(), htmlRequest.getContent().getBytes());
        return new Html(rawHtml);
    }
}
