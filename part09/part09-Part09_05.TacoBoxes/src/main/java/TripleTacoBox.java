/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
public class TripleTacoBox implements TacoBox {
    private int tacos;
    
    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    public void eat() {
        if (this.tacos > 0) {
            this.tacos = tacos - 1;
        }
    }
    
    public int tacosRemaining() {
        return this.tacos;
    }
}
