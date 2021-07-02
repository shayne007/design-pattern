package designpattern.patterns.behavior.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */
public class ArrayIterator<E> implements MyIterator<E> {
    private int cursor;

    private ArrayList<E> arrayList;

    public ArrayIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
        this.cursor = 0;
    }

    @Override

    public boolean hasNext() {
        return cursor != arrayList.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E curItem() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
