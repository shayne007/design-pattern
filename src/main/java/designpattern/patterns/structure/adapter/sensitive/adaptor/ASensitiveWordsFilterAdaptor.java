package designpattern.patterns.structure.adapter.sensitive.adaptor;

import designpattern.patterns.structure.adapter.sensitive.filter.ASensitiveWordsFilter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;

    public ASensitiveWordsFilterAdaptor(ASensitiveWordsFilter filter) {
        this.aFilter = filter;
    }

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}