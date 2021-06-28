package designpattern.objectoriented.abclass;

import java.io.IOException;
import java.util.logging.Level;

// 抽象类
public abstract class Logger {
    private String name;
    private boolean enabled;
    private Level minPermittedLevel;//日志级别

    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(Level level, String message) throws IOException {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) {
            return;
        }
        doLog(level, message);
    }

    protected abstract void doLog(Level level, String message) throws IOException;
}
