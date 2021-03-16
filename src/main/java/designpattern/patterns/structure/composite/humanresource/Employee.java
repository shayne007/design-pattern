package designpattern.patterns.structure.composite.humanresource;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
