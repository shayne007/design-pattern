package designpattern.principles.lod.serialize;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class SerializableUser {
    private Serializable serializer;

    public SerializableUser(Serializable serializer) {
        this.serializer = serializer;
    }
    // ...
}
