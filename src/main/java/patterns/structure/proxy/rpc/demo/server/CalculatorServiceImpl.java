package patterns.structure.proxy.rpc.demo.server;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int a, int b) {
        System.out.println("server add");
        return a + b;
    }
}
