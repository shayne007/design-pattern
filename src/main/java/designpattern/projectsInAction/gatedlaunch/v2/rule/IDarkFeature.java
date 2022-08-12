package designpattern.projectsInAction.gatedlaunch.v2.rule;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public interface IDarkFeature {
    boolean enabled();

    boolean dark(long darkTarget);

    boolean dark(String darkTarget);

    default boolean dark(Object o) {
        return false;
    }
}