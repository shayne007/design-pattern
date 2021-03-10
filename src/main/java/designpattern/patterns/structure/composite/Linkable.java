package designpattern.patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Linkable implements WinComponent {
    private String name;

    public Linkable(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a link: "+this.name);
    }
}
