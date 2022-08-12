package designpattern.projectsInAction.gatedlaunch.v1;

import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkFeature;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public class DarkDemo {
    public static void main(String[] args) {
        DarkLaunch darkLaunch = new DarkLaunch();
        DarkFeature darkFeature = darkLaunch.getDarkFeature("call_newapi_getUserById");
        System.out.println(darkFeature.enabled());
        System.out.println(darkFeature.dark("893"));
    }
}
