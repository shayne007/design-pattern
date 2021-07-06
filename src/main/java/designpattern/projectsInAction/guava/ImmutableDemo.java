package designpattern.projectsInAction.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * @author fengsy
 * @date 7/4/21
 * @Description
 */

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("a");
        originalList.add("b");
        originalList.add("c");

        List<String> jdkUnmodifiableList = Collections.unmodifiableList(originalList);
        List<String> guavaImmutableList = ImmutableList.copyOf(originalList);

        // jdkUnmodifiableList.add("d"); // 抛出UnsupportedOperationException
        // guavaImmutableList.add("d"); // 抛出UnsupportedOperationException
        originalList.add("d");

        print(originalList); // a b c d
        print(jdkUnmodifiableList); // a b c d
        print(guavaImmutableList); // a b c
    }

    private static void print(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}