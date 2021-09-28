interface infra3 {
    default void m6() {
        System.out.println("default method");
    }
    interface infra4 {
        default void m6() {
            System.out.println("default method 2");
        }
    }
    public class lamda_8 implements infra3, infra4 {
        public void m6() {
            infra3.super.m6();
            infra4.super.m6();
        }
        public static void main(String[] args) {
            lamda_8 l = new lamda_8();
            l.m6();

        }


    }
}
