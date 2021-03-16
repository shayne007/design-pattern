package designpattern.patterns.structure.adapter.sensitive.adaptor;

import designpattern.patterns.structure.adapter.sensitive.filter.BSensitiveWordsFilter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private BSensitiveWordsFilter bFilter;

    public BSensitiveWordsFilterAdaptor(BSensitiveWordsFilter filter) {
        this.bFilter = filter;
    }

    @Override
    public String filter(String text) {
        String maskedText = bFilter.filter(text);
        return maskedText;
    }
}