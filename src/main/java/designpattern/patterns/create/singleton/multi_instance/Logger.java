package designpattern.patterns.create.singleton.multi_instance;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */

public class Logger {
    private static final ConcurrentHashMap<String, Logger> instances
            = new ConcurrentHashMap<>();

    private Logger() {
    }

    public static Logger getInstance(String loggerName) {
        instances.putIfAbsent(loggerName, new Logger());
        return instances.get(loggerName);
    }

    public void log() {
        //...
    }
}

//    //l1==l2, l1!=l3
//    Logger l1 = Logger.getInstance("User.class");
//    Logger l2 = Logger.getInstance("User.class");
//    Logger l3 = Logger.getInstance("Order.class");