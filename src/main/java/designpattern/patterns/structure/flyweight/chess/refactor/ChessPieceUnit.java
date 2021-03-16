package designpattern.patterns.structure.flyweight.chess.refactor;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
// 享元类
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

    // ...省略其他属性和getter方法...
}
