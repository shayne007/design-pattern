package designpattern.principles.lod.download.better;

import designpattern.principles.lod.download.Html;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
// 通过一个工厂方法来创建Document
public class DocumentFactory {
    private HtmlDownloader htmlDownloader;//依赖注入

    public DocumentFactory(HtmlDownloader downloader) {
        this.htmlDownloader = downloader;
    }

    public Document createDocument(String url) {
        Html html = new Html();
        return new Document(url, html);
    }
}