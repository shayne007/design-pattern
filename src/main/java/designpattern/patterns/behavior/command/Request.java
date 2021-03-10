package designpattern.patterns.behavior.command;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class Request {
    Event getEvent() {
        return Event.ARCHIVE;
    }
}
