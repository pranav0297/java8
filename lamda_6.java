interface infra6{
    default void m4(){
        System.out.println("default");
    }
    static void m5(){
        System.out.println("static method");
    }
}
public class lamda_6 implements infra6{
    public static void main(String[] args) {
        lamda_6 l = new lamda_6();
        l.m4();
        infra6.m5();
    }
}
