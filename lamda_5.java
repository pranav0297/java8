import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class lamda_5 {
       int id=8;
       String s ="welcome to window";

       void student(String s, int id){
           this.s=s;
           this.id=id;
       }
    public static void main(String[] args) {
           lamda_5 s3 = new lamda_5();
           Consumer<lamda_5> c= h-> System.out.println("Consumer Example =="+s3.s+" "+s3.id);
           c.accept(s3);

            Supplier<Date> d = ()->new Date();
            System.out.println(d.get());

             Predicate<Integer> p = n->n%2==0;
            System.out.println("Predicate Example =="+p.test(3));

            Function<String, String >f = s->s.toUpperCase();
            System.out.println("Function Example== "+f.apply("Pranav Mishra"));
    };
}
