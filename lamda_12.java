import java.util.Arrays;
import java.util.List;

class java_12 {
    public static Integer firstEven(List<Integer> l) {
        return l.stream().filter(i -> i % 2 == 0 && i>5).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        List <Integer> l = Arrays.asList(1,2,3,2,5,6);
        java_12 t = new java_12();
        System.out.println(t.firstEven(l));

    }
}