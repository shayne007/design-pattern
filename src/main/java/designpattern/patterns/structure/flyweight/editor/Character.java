package designpattern.patterns.structure.flyweight.editor;

import java.awt.*;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class Character {// 文字
    private char c;

    private Font font;
    private int size;
    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}