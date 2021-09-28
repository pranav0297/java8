import java.util.Arrays;
import java.util.List;

public class lamda_11 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,2,3,1,5);
        Double average = l.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println(average);
    }
}
