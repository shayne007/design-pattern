package designpattern.projectsInAction.gatedlaunch.v2;

import designpattern.projectsInAction.gatedlaunch.v2.rule.IDarkFeature;
import designpattern.projectsInAction.gatedlaunch.v2.rule.UserPromotionDarkRule;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        DarkLaunch darkLaunch = new DarkLaunch();
        darkLaunch.addProgrammedDarkFeature("user_promotion", new UserPromotionDarkRule(true));
        IDarkFeature darkFeature = darkLaunch.getDarkFeature("user_promotion");
        System.out.println(darkFeature.enabled());
        System.out.println(darkFeature.dark(new User("shayne", 16)));
    }
}
