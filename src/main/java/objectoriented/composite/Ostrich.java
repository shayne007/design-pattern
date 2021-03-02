package objectoriented.composite;

/**
 * @author fengsy
 * @date 3/2/21
 * @Description
 */
public class Ostrich implements Tweetable, EggLayable {
    private TweetAbliity tweetAbliity = new TweetAbliity();// 组合
    private EggLayAbility eggLayAbility = new EggLayAbility();

    @Override
    public void layEgg() {
        eggLayAbility.layEgg();// 委托
    }

    @Override
    public void tweet() {
        tweetAbliity.tweet();
    }
}
