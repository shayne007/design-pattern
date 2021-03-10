package designpattern.patterns.behavior.observer.weather;

/**
 * @author fengsy
 * @date 2/21/21
 * @Description
 */
public class WheatherDisplay2 implements Observer {
    private float temperate;

    public WheatherDisplay2(Subject whether) {
        whether.registerObserver(this);
    }

    @Override
    public void update(float temp) {

        this.temperate = temp;
        display();
    }

    public void display() {
        System.out.println("display2****; " + this.temperate);
    }
}
