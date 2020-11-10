package patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Label implements WinComponent {
    private String content;

    public Label(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("This is a label: "+this.content);
    }
}
