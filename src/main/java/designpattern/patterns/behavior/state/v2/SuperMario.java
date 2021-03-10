package designpattern.patterns.behavior.state.v2;


/**
 * @author fengsy
 * @date 11/10/20
 * @Description
 */
public class SuperMario implements IMario {
    private static final SuperMario instance = new SuperMario();

    private SuperMario() {
    }

    public static SuperMario getInstance() {
        return instance;
    }

    @Override
    public MarioState getName() {
        return MarioState.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine)

    {
        // do nothing...
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine)

    {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
