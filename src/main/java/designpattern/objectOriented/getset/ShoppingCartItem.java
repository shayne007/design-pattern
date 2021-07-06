package designpattern.objectOriented.getset;

/**
 * @author fengsy
 * @date 2/28/21
 * @Description
 */
public class ShoppingCartItem {

    private double price;

    public ShoppingCartItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}