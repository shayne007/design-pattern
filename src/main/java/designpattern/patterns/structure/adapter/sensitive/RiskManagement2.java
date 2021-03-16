package designpattern.patterns.structure.adapter.sensitive;

import java.util.ArrayList;
import java.util.List;

import designpattern.patterns.structure.adapter.sensitive.adaptor.ASensitiveWordsFilterAdaptor;
import designpattern.patterns.structure.adapter.sensitive.adaptor.BSensitiveWordsFilterAdaptor;
import designpattern.patterns.structure.adapter.sensitive.adaptor.CSensitiveWordsFilterAdaptor;
import designpattern.patterns.structure.adapter.sensitive.adaptor.ISensitiveWordsFilter;
import designpattern.patterns.structure.adapter.sensitive.filter.ASensitiveWordsFilter;
import designpattern.patterns.structure.adapter.sensitive.filter.BSensitiveWordsFilter;
import designpattern.patterns.structure.adapter.sensitive.filter.CSensitiveWordsFilter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
// 扩展性更好，更加符合开闭原则，如果添加一个新的敏感词过滤系统，
// 这个类完全不需要改动；而且基于接口而非实现编程，代码的可测试性更好。
public class RiskManagement2 {
    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }

    public static void main(String[] args) {
        String text = "你他妈真是个大傻逼！";
        RiskManagement2 riskManagement2 = new RiskManagement2();
        riskManagement2.addSensitiveWordsFilter(new ASensitiveWordsFilterAdaptor(new ASensitiveWordsFilter()));
        riskManagement2.addSensitiveWordsFilter(new BSensitiveWordsFilterAdaptor(new BSensitiveWordsFilter()));
        riskManagement2.addSensitiveWordsFilter(new CSensitiveWordsFilterAdaptor(new CSensitiveWordsFilter()));
        String result = riskManagement2.filterSensitiveWords(text);
        System.out.println(result);
    }
}