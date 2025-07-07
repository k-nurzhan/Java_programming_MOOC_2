
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
public class MisplacingBox extends Box {
        private ArrayList<Item> items;
    
        public MisplacingBox() {
            super();
            this.items = new ArrayList<>();
        }

        @Override
        public void add(Item item) {

            items.add(item);
        }
        
        @Override
        public boolean isInBox(Item item) {
            return false;
        }
}
