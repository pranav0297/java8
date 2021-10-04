interface MyInterface{
    void display(int a , int b);
}
public class test {

    public void add(int a ,int b){
        System.out.println(a+b);
    }
    public void mul(int a ,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        test obj = new test();
        MyInterface ref = obj::add;
        MyInterface ref1 = obj::mul;
        ref.display(2,5);
        ref1.display(2,5);
    }
}
