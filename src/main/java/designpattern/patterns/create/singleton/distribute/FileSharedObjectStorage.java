package designpattern.patterns.create.singleton.distribute;

/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */
public class FileSharedObjectStorage<T> implements SharedObjectStorage<T> {

    @Override
    public T load(Class aClass) {
        return null;
    }

    @Override
    public void save(T t, Class<T> tClass) {

    }
}
