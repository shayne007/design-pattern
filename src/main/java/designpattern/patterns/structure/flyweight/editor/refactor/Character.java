package designpattern.patterns.structure.flyweight.editor.refactor;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}