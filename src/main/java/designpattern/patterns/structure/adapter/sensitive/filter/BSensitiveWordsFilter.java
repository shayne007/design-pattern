package designpattern.patterns.structure.adapter.sensitive.filter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
public class BSensitiveWordsFilter { // B敏感词过滤系统提供的接口
    public String filter(String text) {
        // ...
        return text.replace("傻逼", "***");
    }
}