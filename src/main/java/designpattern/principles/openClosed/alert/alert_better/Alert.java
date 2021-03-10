package designpattern.principles.openClosed.alert.alert_better;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */

public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }
}
