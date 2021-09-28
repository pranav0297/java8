interface infar{
    default void m1(){
        System.out.println("default method");
    }
}
public class lamda_7 implements infar {
    public void m1(){
        System.out.println("override default method");
    }
    public static void main(String[] args) {
        lamda_7 l = new lamda_7();
        l.m1();
    }
}
