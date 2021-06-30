package designpattern.patterns.behavior.templateMethod;

import java.util.Collection;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public class AbstractList<E> {

    public boolean addAll(int index, Collection<? extends E> c) {
//        rangeCheckForAdd(index);

        boolean modified = false;
        for (E e : c) {
            add(index++, e);
            modified = true;
        }
        return modified;
    }

    /**
     * 抛出异常，强制要求子类扩展重写
     *
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }
}
