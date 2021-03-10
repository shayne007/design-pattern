package designpattern.principles.interfaceSegregation.config;

import java.util.Map;

public interface Viewer {
    String outputInPlainText();

    Map<String, String> output();
}
