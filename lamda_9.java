import java.util.Arrays;
import java.util.List;
class java_9 {
    public static void  firstEven(List<Integer> l) {
        l.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
    public static void main (String[]args){
        List<Integer> l = Arrays.asList(1, 2, 3, 2, 5, 6);
        firstEven(l);
    }
}