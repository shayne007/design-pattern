package designpattern.principles.lod.serialize;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class DeserializableUser {
    private Deserializable deserializer;

    public DeserializableUser(Deserializable deserializer) {
        this.deserializer = deserializer;
    }
    // ...
}