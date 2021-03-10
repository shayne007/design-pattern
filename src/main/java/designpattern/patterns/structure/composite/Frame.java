package designpattern.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Frame implements WinComponent {
    private String name;

    public Frame(String name) {
        this.name = name;
    }

    private List<WinComponent> componentList = new ArrayList<>();

    public void addComponent(WinComponent component) {
        this.componentList.add(component);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        System.out.println("frame begin--------------------------");
        for (WinComponent component : componentList){
            component.print();
        }
        System.out.println("frame end--------------------------");
    }

}
