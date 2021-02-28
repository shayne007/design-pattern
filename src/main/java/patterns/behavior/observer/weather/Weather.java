package patterns.behavior.observer.weather;

import java.util.ArrayList;

/**
 * @author fengsy
 * @date 2/21/21
 * @Description
 */
public class Weather implements Subject {

    private ArrayList<Observer> obsevers = new ArrayList<>();
    private float temperate;

    @Override
    public void registerObserver(Observer o) {
        this.obsevers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.removeObserver(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.obsevers.size(); i++) {
            this.obsevers.get(i).update(temperate);
        }
    }

    public void whetherChange() {
        this.notifyObservers();
    }

    public float getTemperate() {
        return temperate;
    }

    public void setTemperate(float temperate) {
        this.temperate = temperate;
        notifyObservers();
    }
}
