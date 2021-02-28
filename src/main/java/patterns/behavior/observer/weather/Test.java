package patterns.behavior.observer.weather;

/**
 * @author fengsy
 * @date 2/21/21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WheatherDisplay1 display1 = new WheatherDisplay1(weather);
        WheatherDisplay2 display2 = new WheatherDisplay2(weather);
        weather.setTemperate(27);
        weather.setTemperate(25);

    }
}
