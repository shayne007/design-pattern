package patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class TextBox implements WinComponent {
    private String name;

    public TextBox(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a textbox: "+this.name);
    }
}
