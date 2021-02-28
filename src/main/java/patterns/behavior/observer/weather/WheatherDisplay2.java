package patterns.behavior.observer.weather;

/**
 * @author fengsy
 * @date 2/21/21
 * @Description
 */
public class WheatherDisplay1 implements Observer {
    private float temperate;

    public WheatherDisplay1(Subject whether) {
        whether.registerObserver(this);
    }

    @Override
    public void update(float temp) {

        this.temperate = temp;
        display();
    }

    public void display() {
        System.out.println("display1****; " + this.temperate);
    }
}
