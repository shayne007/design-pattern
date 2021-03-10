package designpattern.principles.lod.serialize;

import java.util.List;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class Serialization implements Serializable, Deserializable {
    @Override
    public String serialize(Object object) {
        String serializedResult = "...";
        // ...
        return serializedResult;
    }

    @Override
    public String serializeMap(Map map) {
        return null;
    }

    @Override
    public String serializeList(List list) {
        return null;
    }

    @Override
    public Object deserialize(String str) {
        Object deserializedResult = "...";
        // ...
        return deserializedResult;
    }

    @Override
    public Map deserializeMap(String mapString) {
        return null;
    }

    @Override
    public List deserializeList(String listString) {
        return null;
    }
}