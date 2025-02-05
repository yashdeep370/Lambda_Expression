@FunctionalInterface
interface Mylambda{
    public void display();
}

public class lamda {
    public static void main(String[] args) {
        Mylambda m = () -> {System.out.println("Hello");};
        m.display();
    }
}


// class My implements Mylambda{
//     public void display(){
//         System.out.println("Hello");
//     }   
// }

