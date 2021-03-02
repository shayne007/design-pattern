package objectoriented.getset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author fengsy
 * @date 2/28/21
 * @Description
 */
public class ShoppingCartBetter {
    private int itemsCount;
    private double totalPrice;
    private List<ShoppingCartItem> items = new ArrayList<>();

    public int getItemsCount() {
        return this.itemsCount;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
        itemsCount++;
        totalPrice += item.getPrice();
    }

    public void clear() {
        items.clear();
        itemsCount = 0;
        totalPrice = 0.0;
    }

    public List<ShoppingCartItem> getItems() {
        return Collections.unmodifiableList(this.items);
    }
    // ...省略其他方法...
}
