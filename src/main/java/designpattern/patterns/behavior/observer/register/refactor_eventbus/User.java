package designpattern.patterns.behavior.observer.register.refactor_eventbus;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public class User {
    private String name;
    private long userid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
