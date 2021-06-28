package designpattern.patterns.create.singleton.distribute;

/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */
public interface SharedObjectStorage<T> {

    T load(Class<T> tClass);

    void save(T t, Class<T> tClass);
}
