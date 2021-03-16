package designpattern.patterns.structure.adapter.sensitive;

import designpattern.patterns.structure.adapter.sensitive.filter.ASensitiveWordsFilter;
import designpattern.patterns.structure.adapter.sensitive.filter.BSensitiveWordsFilter;
import designpattern.patterns.structure.adapter.sensitive.filter.CSensitiveWordsFilter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */

// 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
public class RiskManagement {
    private ASensitiveWordsFilter aFilter = new ASensitiveWordsFilter();
    private BSensitiveWordsFilter bFilter = new BSensitiveWordsFilter();
    private CSensitiveWordsFilter cFilter = new CSensitiveWordsFilter();

    public String filterSensitiveWords(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        maskedText = bFilter.filter(maskedText);
        maskedText = cFilter.filter(maskedText, "***");
        return maskedText;
    }
}