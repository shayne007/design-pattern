package designpattern.patterns.behavior.state.table;

import designpattern.patterns.behavior.state.v1.MarioState;

import static designpattern.patterns.behavior.state.v1.MarioState.CAPE;
import static designpattern.patterns.behavior.state.v1.MarioState.FIRE;
import static designpattern.patterns.behavior.state.v1.MarioState.SMALL;
import static designpattern.patterns.behavior.state.v1.MarioState.SUPER;

/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */

public class MarioStateMachine {
    private int score;
    private MarioState currentState;

    private static final MarioState[][] transitionTable = {
            {SUPER, CAPE, FIRE, SMALL},
            {SUPER, CAPE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL},
            {FIRE, FIRE, FIRE, SMALL}
    };

    private static final int[][] actionTable = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = MarioState.SMALL;
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score += actionTable[stateValue][eventValue];
    }

    public int getScore() {
        return this.score;
    }

    public MarioState getCurrentState() {
        return this.currentState;
    }

}