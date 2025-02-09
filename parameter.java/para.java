@FunctionalInterface
interface Mylambda{
    // public void display(String str);
    public int add(int a, int b);
}

public class para {
    public static void main(String[] args) {
        // Mylambda m = (s) -> {System.out.println(s);};
        // m.display("hello");
        
        Mylambda m = (a, b) -> {return a+b;};
        System.out.println(m.add(10, 20));
    }
}


