import java.util.Locale;
import java.util.function.Predicate;

@FunctionalInterface
interface infer{
    boolean check(int a,int b);
}
interface infer1{
    int check1(int a);
}
interface infer2{
    String check2(String a,String b);
}
interface infer3{
    String check3(String a);
}

public class lamda1 {
    public static void main(String[] args) {
      infer p= (a,b)-> a>b;
        System.out.println(p.check(2,3));

        infer1 p1= (a)-> a+=1;
        System.out.println(p1.check1(2));


        infer2 p2= (a,b)-> a+b;
        System.out.println(p2.check2("Hello ","World"));


        infer3 p3= (a)-> a.toUpperCase();
        System.out.println(p3.check3("pranav mishra"));

    }


}
