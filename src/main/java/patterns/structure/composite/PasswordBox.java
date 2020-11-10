package patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class PasswordBox implements WinComponent {
    private String name;

    public PasswordBox(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a passwordbox: "+this.name);
    }
}
