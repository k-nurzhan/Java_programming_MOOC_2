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

public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.product = product;
    }
    
    public int price() {
        return this.unitPrice*this.qty;
    }
    
    public void increaseQuantity() {
        this.qty = qty + 1; 
    }
    
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
