package designpattern.patterns.structure.adapter.sensitive.adaptor;

import designpattern.patterns.structure.adapter.sensitive.filter.CSensitiveWordsFilter;

/**
 * @author fengsy
 * @date 3/12/21
 * @Description
 */
public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private CSensitiveWordsFilter cFilter;

    public CSensitiveWordsFilterAdaptor(CSensitiveWordsFilter filter) {
        this.cFilter = filter;
    }

    @Override
    public String filter(String text) {
        String maskedText = cFilter.filter(text, "***");
        return maskedText;
    }
}