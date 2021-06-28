package designpattern.principles.lod.download.bad;

import designpattern.principles.lod.download.Html;

/**
 * @author fengsy
 * @date 6/26/21
 * @Description
 */


public class Document {
    private Html html;
    private String url;

    public Document(String url) {
        this.url = url;
        HtmlDownloader downloader = new HtmlDownloader();//不必要的依赖，并且是依赖了具体实现
        this.html = downloader.downloadHtml(url);//逻辑复杂，耗时长，影响可测试性
    }
    //...
}