package designpattern.patterns.structure.bridge.alert_v1;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ...省略设置apiStatInfo数据值的代码
        apiStatInfo.setTimeout(1000L);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
