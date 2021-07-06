package designpattern.projectsInAction.mybatis;

import lombok.ToString;

/**
 * @author fengsy
 * @date 2/23/21
 * @Description
 */

// 1. 定义UserDO
@ToString
public class UserDo {
    private String id;
    private String name;
    private String telephone;
    // 省略setter/getter方法
}
