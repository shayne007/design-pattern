package designpattern.patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Picture implements WinComponent {
    private String content;

    public Picture(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("This is a picture: "+this.content);
    }
}
