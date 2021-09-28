@FunctionalInterface
interface infra{
    int m1(int a , int b);
}
public class lamda_2 {
    public static void main(String[] args) {
        infra i = (a,b)-> a;
        System.out.println(i.m1(5,3));
    }
}
