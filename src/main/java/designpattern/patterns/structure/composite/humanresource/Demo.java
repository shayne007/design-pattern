package designpattern.patterns.structure.composite.humanresource;

import java.util.Collections;
import java.util.List;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
// 构建组织架构的代码
public class Demo {
    private static final long ORGANIZATION_ROOT_ID = 1001;
    // private DepartmentRepo departmentRepo; // 依赖注入
    // private EmployeeRepo employeeRepo; // 依赖注入

    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }

    private void buildOrganization(Department department) {
        // List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department.getId());
        List<Long> subDepartmentIds = Collections.emptyList();
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }
        // List<Long> employeeIds = employeeRepo.getDepartmentEmployeeIds(department.getId());
        List<Long> employeeIds = Collections.emptyList();
        for (Long employeeId : employeeIds) {
            // double salary = employeeRepo.getEmployeeSalary(employeeId);
            double salary = 0;
            department.addSubNode(new Employee(employeeId, salary));
        }
    }
}
