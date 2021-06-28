package designpattern.principles.lod.download.bad;

import designpattern.principles.lod.download.HtmlRequest;

/**
 * @author fengsy
 * @date 6/26/21
 * @Description
 */
public class NetworkTransporter {
    // 省略属性和其他方法...

    /**
     * 这里偏底层的网络通信类与一个具体的HtmlRequest类耦合
     *
     * @param htmlRequest
     * @return
     */
    public byte[] send(HtmlRequest htmlRequest) {
        //...
        return null;
    }
}