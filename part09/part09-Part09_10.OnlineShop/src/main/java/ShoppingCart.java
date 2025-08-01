/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (items.keySet().contains(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            items.put(product, new Item(product,1,price));
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (Item i:this.items.values()) {
            totalPrice = totalPrice + i.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item i:this.items.values()) {
            System.out.println(i.toString());;
        }
    }
}
