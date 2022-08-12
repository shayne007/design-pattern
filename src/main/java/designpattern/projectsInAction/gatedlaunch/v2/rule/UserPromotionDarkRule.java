package designpattern.projectsInAction.gatedlaunch.v2.rule;

import designpattern.projectsInAction.gatedlaunch.v2.User;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public class UserPromotionDarkRule implements IDarkFeature {
    private boolean enabled;

    public UserPromotionDarkRule(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean enabled() {
        return enabled;
    }

    @Override
    public boolean dark(long darkTarget) {
        return false;
    }

    @Override
    public boolean dark(String darkTarget) {

        if (isDarked(darkTarget)) {
            return true;
        }
        return false;
    }

    private boolean isDarked(String darkTarget) {
        return true;
    }

    @Override
    public boolean dark(Object o) {
        if (o instanceof User) {
            User user = (User) o;
            int age = user.getAge();
            if (age >= 18) {
                return true;
            }
        }
        return false;
    }
}
