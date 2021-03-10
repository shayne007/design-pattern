package designpattern.patterns.behavior.state.branch;

import designpattern.patterns.behavior.state.v1.MarioState;

/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */
public class MarioStateMachine {
    private int score;
    private MarioState currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = MarioState.SMALL;
    }

    public void obtainMushRoom() {
        if (this.currentState.equals(MarioState.SMALL)) {
            this.currentState = MarioState.SUPER;
            this.score += 100;
        }

    }

    public void obtainCape() {
        if (this.currentState.equals(MarioState.SMALL) || this.currentState.equals(MarioState.SUPER)) {
            this.currentState = MarioState.CAPE;
            this.score += 200;
        }


    }

    public void obtainFireFlower() {
        if (currentState.equals(MarioState.SMALL) || currentState.equals(MarioState.SUPER)) {
            this.currentState = MarioState.FIRE;
            this.score += 300;
        }
    }

    public void meetMonster() {
        if (currentState.equals(MarioState.SUPER)) {
            this.currentState = MarioState.SMALL;
            this.score -= 100;
            return;
        }
        if (currentState.equals(MarioState.CAPE)) {
            this.currentState = MarioState.SMALL;
            this.score -= 200;
            return;
        }
        if (currentState.equals(MarioState.FIRE)) {
            this.currentState = MarioState.SMALL;
            this.score -= 300;
            return;
        }
    }

    public int getScore() {
        return this.score;
    }

    public MarioState getCurrentState() {
        return this.currentState;
    }
}
