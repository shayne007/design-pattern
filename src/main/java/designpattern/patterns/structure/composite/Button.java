package designpattern.patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Button implements WinComponent {
    private String content;

    public Button(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("This is a button: "+this.content);
    }
}
