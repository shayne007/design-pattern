package designpattern.objectOriented.getset;

import java.util.List;

/**
 * @author fengsy
 * @date 2/28/21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCartBad shoppingCartBad = new ShoppingCartBad();
        // this can cause problems when itemsCount and itemPrice are not cleared
        shoppingCartBad.getItems().clear();

        ShoppingCartBetter shoppingCart = new ShoppingCartBetter();
        shoppingCart.addItem(new ShoppingCartItem(3.0));
        // shoppingCart.clear();

        // throws UnsupportedOperationException
        // shoppingCart.getItems().clear();

        // reference to the items in the collection still can be modified
        List<ShoppingCartItem> shoppingCartItems = shoppingCart.getItems();
        ShoppingCartItem shoppingCartItem = shoppingCartItems.get(0);
        shoppingCartItem.setPrice(0.0);

    }
}
