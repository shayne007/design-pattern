package patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class CheckBox implements WinComponent {
    private String name;

    public CheckBox(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a checkbox: "+this.name);
    }
}
