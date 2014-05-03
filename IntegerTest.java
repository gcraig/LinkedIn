
public class IntegerTest {
    
    public void run() {

        Integer a = 1;
        Integer b = new Integer(2);
        Integer c = a + b;

        isObj(a);
        isObj(b);
        isObj(c);

        isPrim(a);
        isPrim(b);
        isPrim(c);
    }

    public void isObj(Integer x) {
        if (x.getClass().equals(Integer.class)) {
            System.out.println("Obj");
        } else {
            System.out.println("Prim");
        }
    }

    public void isPrim(int x) {
        Integer i = x;
        if (i.getClass().equals(Integer.class)) {
            System.out.println("Obj");
        } else {
            System.out.println("Prim");
        }
    }    

    public static void main(String[] args) {
        new IntegerTest().run();

//        Integer a = null;
//        int x = a; // autounbox
//        System.out.println(x);
    }
}