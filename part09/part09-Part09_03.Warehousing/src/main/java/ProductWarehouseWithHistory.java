/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        double result = 0;
        result = super.getBalance() + amount;
        history.add(result);
        super.addToWarehouse(amount);
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;
        result = super.getBalance() - amount;
        history.add(result);
        return super.takeFromWarehouse(amount);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
