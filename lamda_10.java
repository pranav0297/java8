import java.util.Arrays;
import java.util.List;
class java_10{

    int add(List<Integer> l) {
        return l.stream().mapToInt(i ->i.intValue()).filter(i->i>5).sum();
    }
    public static void main(String[] args) {
        List <Integer>l =Arrays.asList(1,2,3,4,5,6,7) ;
        java_10 t = new java_10();
        System.out.println(t.add(l));
    }
}
