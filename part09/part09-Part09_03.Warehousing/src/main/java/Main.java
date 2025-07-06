
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        
        ChangeHistory ch = new ChangeHistory();
        ch.add(4.0);
        ch.add(-1.0);
        ch.add(3);
        System.out.println(ch.toString());
        System.out.println(ch.average());
    }

}
