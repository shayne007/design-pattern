package designpattern.patterns.behavior.strategy.sort;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */
public class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }
}