package designpattern.principles.lod.serialize;

import java.util.List;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */

public interface Serializable {
    String serialize(Object object);

    String serializeMap(Map map);

    String serializeList(List list);
}
