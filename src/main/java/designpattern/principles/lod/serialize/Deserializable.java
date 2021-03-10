package designpattern.principles.lod.serialize;

import java.util.List;
import java.util.Map;

public interface Deserializable {
    Object deserialize(String text);

    public Map deserializeMap(String mapString);

    public List deserializeList(String listString);
}
