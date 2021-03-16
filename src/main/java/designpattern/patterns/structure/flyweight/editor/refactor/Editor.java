package designpattern.patterns.structure.flyweight.editor.refactor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
