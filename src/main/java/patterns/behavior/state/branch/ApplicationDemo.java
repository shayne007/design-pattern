package patterns.behavior.state.branch;

import patterns.behavior.state.v1.MarioState;

/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */

public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        mario.obtainCape();
        int score = mario.getScore();
        MarioState state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}