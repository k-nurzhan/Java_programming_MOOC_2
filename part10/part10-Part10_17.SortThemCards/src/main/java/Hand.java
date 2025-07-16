import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        
        while (iterator.hasNext()) {
            Card next = iterator.next();
            System.out.println(next);
        }
    }
    
    public void sort() {
        Collections.sort(cards,(x,y) -> x.compareTo(y) );
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand otherhand) {
        int sum = cards.stream()
                .map(value -> value.getValue())
                .reduce(0, (prevSum,value) -> prevSum + value);
        int sumCompared = otherhand.cards.stream()
                .map(value -> value.getValue())
                .reduce(0, (prevSum,value) -> prevSum + value);
        return sum - sumCompared;
    }
}
