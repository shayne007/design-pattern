package designpattern.patterns.behavior.iterator;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */
public interface MyIterator<E> {
    boolean hasNext();

    void next();

    E curItem();
}
