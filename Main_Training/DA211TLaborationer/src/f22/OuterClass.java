package f22;

public class OuterClass {
    private int a=20;
    private InnerClass cls = new InnerClass();
    
    public OuterClass() {
        cls.privateInnerMethod();
     }
    
    private void privateOuterMethod() {
        cls.b = cls.b + 1;  // private-deklarerade instansvariabler är synliga
        System.out.println("privateYttreMetod(): "+cls.b);
    }
    
    private class InnerClass {
        private int b=10;
        
        private void privateInnerMethod() {
            a = a + 1;
            System.out.println("privateInreMetod1(): "+a);
            privateOuterMethod();
        }
    }
    
    public static void main(String[] args) {
        OuterClass ek = new OuterClass();
    }
}
