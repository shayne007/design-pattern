package designpattern.patterns.behavior.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author fengsy
 * @date 11/11/20
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator iterator = names.iterator();
        Iterator iterator2 = names.iterator();
        iterator.next();
        iterator.remove();
        iterator2.next();


    }
}
