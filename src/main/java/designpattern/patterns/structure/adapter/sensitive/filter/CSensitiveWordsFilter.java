package designpattern.patterns.structure.adapter.sensitive.filter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
public class CSensitiveWordsFilter { // B敏感词过滤系统提供的接口
    public String filter(String text, String mask) {
        // ...
        return text.replace("他妈", mask);
    }
}