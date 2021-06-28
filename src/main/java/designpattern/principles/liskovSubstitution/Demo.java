package designpattern.principles.liskovSubstitution;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class Demo {
    public void demoFunction(Transporter transporter) throws ParentRuntimeException {
        Request request = new Request();
        // ...省略设置request中数据值的代码...
        Response response = transporter.sendRequest(request);
        // ...省略其他逻辑...
    }

    public static void main(String[] args) throws ParentRuntimeException {
        // 里式替换原则
        Demo demo = new Demo();
        demo.demoFunction(new SecurityTransporter(/*省略参数*/));
    }

}
