package designpattern.patterns.structure.flyweight.editor.refactor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}