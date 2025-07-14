
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        while(true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input<0) {
                break;
            }
            inputs.add(input);
        }
        ArrayList<Integer> combined = inputs.stream()
                .filter(value -> value<6)
                .collect(Collectors.toCollection(ArrayList::new));
        combined.stream()
                .forEach(value -> System.out.println(value));
        
    }
}
