package designpattern.objectoriented.getset;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 2/28/21
 * @Description
 */
public class ShoppingCartBad {
    private int itemsCount;
    private double totalPrice;
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemsCount() {
        return this.itemsCount;
    }

    /**
     * bad to set this field public which can conflict to the totalPrice
     */
    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * bad to set this field which can conflict to other fields
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * bad to set get a collection which can be modified outside this class
     */
    public List<ShoppingCartItem> getItems() {
        return this.items;
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemsCount++;
        totalPrice += item.getPrice();
    }
    // ...省略其他方法...
}