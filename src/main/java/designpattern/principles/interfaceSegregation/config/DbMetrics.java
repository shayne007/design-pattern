package designpattern.principles.interfaceSegregation.config;

import java.util.Map;

public class DbMetrics implements Viewer {
    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
