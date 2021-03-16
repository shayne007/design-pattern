package designpattern.patterns.structure.composite.humanresource;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
