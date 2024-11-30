abstract class A{
   public abstract void abc();
   public void bcd(){
    System.out.println("bcd() calles");
   }
}
class B extends A{
    public void abc(){
        System.out.println("abc() called.");
    }
    public void cde(){
    System.out.println("cde() called");
}
}

public class AbstractClassExample {
    public static void main(String[] args) {
        B b=new B();
        b.abc();
        b.cde();
        b.bcd();
        A a=new B();
        a.abc();
        a.bcd();
    }
}
