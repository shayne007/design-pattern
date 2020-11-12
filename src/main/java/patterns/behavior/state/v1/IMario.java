package patterns.behavior.state.v1;

/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */
public interface IMario {
    MarioState getName(); //以下是定义的事件

    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
